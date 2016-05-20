import {bootstrap}    from '@angular/platform-browser-dynamic';
import {Component} from '@angular/core';
import {CORE_DIRECTIVES, FORM_DIRECTIVES} from '@angular/common';
import {Http, Headers} from '@angular/http';
import {NgForm} from '@angular/common';
import {Router} from '@angular/router';
import { ROUTER_DIRECTIVES, Routes } from '@angular/router';




@Component({
    selector: 'my-files',
    directives: [ CORE_DIRECTIVES, FORM_DIRECTIVES, ROUTER_DIRECTIVES ],
    templateUrl: './files.html'

})
export class FilesComponent {
    
    public folders : Array<Folder>;
    public files : string;
    public username : String;
constructor(public http: Http) {
        this.folders = new Array<Folder>();
       this.http=http;
       this.username="";
        this.getFilesDrive();
   }
    
    getFilesDropbox() {
        this.http.get('webapi/userfiles/dropbox')
        .map(res => res.text())
        .subscribe(
          data => this.files = data,
          err => this.logError(err),
          () => this.consultDataDropbox()
        );
    }
    
    getFilesDrive() {
        this.http.get('webapi/userfiles/drive')
        .map(res => res.text())
        .subscribe(
          data => this.files = data,
          err => this.logError(err),
          () => this.consultData()
        );
        this.getFilesDropbox();
    }
    
    consultData(){
       // console.log(this.files);
        var filesDetails = JSON.parse(this.files);

        for(var i = 0; i<filesDetails.items.length; i++){
            if (filesDetails.items[i].parents[0] == undefined || filesDetails.items[i].parents[0].isRoot==true){

                var id = filesDetails.items[i].id;
                var name = filesDetails.items[i].title;
                var size = filesDetails.items[i].fileSize + " bytes";
                var date = filesDetails.items[i].createdDate;
                var prov = "drive";
                var own = filesDetails.items[i].ownerNames[0];
                var lien = filesDetails.items[i].embedLink;
                var isDir = false;
                if(filesDetails.items[i].mimeType.indexOf("folder") > -1){
                    isDir = true;
                }
                
                var folder = new Folder(id, name, size, date, prov, own, lien, isDir);
                if(isDir){
                    folder.getSons(this.http);
                }
                this.folders.push(folder);
            }
        }
    }
    
    consultDataDropbox(){
       // console.log(this.files);
        var filesDetails = JSON.parse(this.files);
        for(var i = 0; i<filesDetails.contents.length; i++){
            
            var name = filesDetails.contents[i].path;
            var size = filesDetails.contents[i].size;
            var date = filesDetails.contents[i].modified;
            var prov = "dropbox"
            var own = "Proprietaire";
            var linkdata;
            var lien;
            var isDir = filesDetails.contents[i].is_dir;
            if(filesDetails.contents[i].is_dir=="true"){
                isDir = true;
            }
            else if(isDir==false){
                this.http.get('webapi/preview/dropbox?path=' + name)
                .map(res => res.text())
                .subscribe(
                    data => linkdata = data,
                    err => console.log('There was an error:' + err),
                    () => lien = this.getLink(JSON.parse(linkdata))

                );
            }
            var folder =  new Folder(null,name,size,date,prov,own,lien, isDir);
            if(isDir){
                    folder.getSons(this.http);
            }
            this.folders.push(folder);
        }
    }
    
    getLink(linkdata){
        var lien = linkdata.url;
        return lien;
    }
    

    logError(err) {
        console.error('There was an error: ' + err);
    }
}


class Folder{
    id : String;
    name: String;
    size: String;
    date: String;
    provide: String;
    owner: String;
    link: String;
    isDir: Boolean;
    isActive : Boolean;
    sons : Array<Folder>;
    
    linkData;
    
    files : string; // instance JSO?
    
constructor(public idFile : String, public nameFolder : String, public sizeF : String, public dte: String, public provideF : String,public own : String, public lnk : String, public isFolder: Boolean){
        this.id=idFile;
        this.name = nameFolder;
        this.size = sizeF;
        this.date = dte;
        this.provide =provideF;
        this.owner = own;
        this.link = lnk;
        this.isDir = isFolder;
        this.isActive = false;
        this.adaptFolder();
    }
    
    adaptFolder(){
        if(this.isDir){
            this.name+="/";
            this.sons = new Array<Folder>();
        }
    }
    
    activateRow(){
        this.isActive = !this.isActive;
    }
    
    getSons(http : Http){
        if (this.id != null){
            //Partie drive
            http.get('webapi/userfiles/drive')
                .map(res => res.text())
                .subscribe(
                data => this.files = data,
                err =>  console.error('There was an error: ' + err),
                () => this.setSonsDrive(http)
            );
        }
        else{
            http.get('webapi/userfiles/dropbox?path='+this.name)
                .map(res => res.text())
                .subscribe(
                data => this.files = data,
                err =>  console.error('There was an error: ' + err),
                () => this.setSonsDropbox(http)
            );
        }

    }
    
setSonsDrive(http : Http){
        var filesDetails = JSON.parse(this.files);

        for(var i = 0; i<filesDetails.items.length; i++){
            var id = filesDetails.items[i].id;
            var name = filesDetails.items[i].title;
            var size = filesDetails.items[i].fileSize + " bytes";
            var date = filesDetails.items[i].createdDate;
            var prov = "drive";
            var own = filesDetails.items[i].ownerNames[0];
            var lien = filesDetails.items[i].embedLink;
            var isDir = false;
            if(filesDetails.items[i].mimeType.indexOf("folder") > -1){
                isDir = true;
            }

            var folder = new Folder(id, name, size, date, prov, own, lien, isDir);
            if(isDir){
                folder.getSons(http);
            }
            this.sons.push(folder);
        }

    }
    
setSonsDropbox(http : Http){
        // console.log(this.files);
        var filesDetails = JSON.parse(this.files);
        for(var i = 0; i<filesDetails.contents.length; i++){
            
            var name = filesDetails.contents[i].path;
            var size = filesDetails.contents[i].size;
            var date = filesDetails.contents[i].modified;
            var prov = "dropbox"
            var own = "Proprietaire";
           
            var isDir = false;
            if(filesDetails.contents[i].is_dir=="true"){
                isDir = true;
                var folder =  new Folder(null,name,size,date,prov,own,"", isDir);
                
            }
            else if(isDir==false){
                var folder =  new Folder(null,name,size,date,prov,own,"", isDir); 
                http.get('webapi/preview/dropbox?path=' + name)
                .map(res => res.text())
                .subscribe(
                    data => this.linkData = JSON.parse(data),
                    err => console.log('There was an error: ' + err),
                    () => {folder = new Folder(null,name,size,date,prov,own,this.linkData.url, isDir);}
                );
            }   
            this.sons.push(folder);            
            if(folder.isDir){
                    folder.getSons(http);
            }
        }
    }
    
    
}
