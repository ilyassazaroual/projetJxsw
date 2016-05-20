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
    public resDelete : String;
constructor(public http: Http) {
        this.folders = new Array<Folder>();
       this.http=http;
       this.username="";
       this.resDelete='';
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
<<<<<<< HEAD
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
=======
            var id = filesDetails.items[i].id;
            var name = filesDetails.items[i].title;
            var newname = 'new Name';//filesDetails.items[i].title;1048576
            var size = (filesDetails.items[i].fileSize/1048576) + " Mo";
            var date = filesDetails.items[i].createdDate;
            var prov = "drive";
            var own = filesDetails.items[i].ownerNames[0];
            var lien = filesDetails.items[i].embedLink;
            var isDir = false;
            if(filesDetails.items[i].mimeType.indexOf("folder") > -1){
                isDir = true;
            }
            this.folders.push(new Folder(id,name,newname,size,date,prov,own,lien, isDir));
        }
        console.log("drivFolder "+this.folders[0]);
>>>>>>> 96f3d957d577b0773bae993e27d25dbc290b6fe5
    }
    
    consultDataDropbox(){
       // console.log(this.files);
        var filesDetails = JSON.parse(this.files);
        for(var i = 0; i<filesDetails.contents.length; i++){
<<<<<<< HEAD
            
=======
            var id ="0123idDropbox";
>>>>>>> 96f3d957d577b0773bae993e27d25dbc290b6fe5
            var name = filesDetails.contents[i].path;
            var newname ='new Name';//filesDetails.contents[i].path;
            var size = (filesDetails.contents[i].size/1048576)+" Mo";
            var date = filesDetails.contents[i].modified;
            var prov = "dropbox"
            var own = "Proprietaire";
            var linkdata;
            var lien;
            var isDir = filesDetails.contents[i].is_dir;
            if(filesDetails.contents[i].is_dir=="true"){
                isDir = true;
            }
<<<<<<< HEAD
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
=======
            
            this.folders.push(new Folder(id,name,newname,size,date,prov,own,lien, isDir));
        }
        console.log("dropFolder "+this.folders[0]);
>>>>>>> 96f3d957d577b0773bae993e27d25dbc290b6fe5
    }
    
    deleteFileDropbox(path :string ){
        this.http.get('webapi/delete/dropbox?path='+path)
        .map(res => res.text())
        .subscribe(
          data => this.resDelete = data,
          err => this.logError(err),
          () => this.resDelete = "Suppression réussie fichier supprimé = "+path
        );
        
    }

    deleteFileDrive(id :string, name:string ){
        this.http.get('webapi/delete/drive?fileid='+id)
        .map(res => res.text())
        .subscribe(
          data => this.resDelete = data,
          err => this.logError(err),
          () => this.resDelete = "Suppression réussie : fichier supprimé = "+name
        );
        this.getFilesDrive();
    }

    renameFileDrive(id :string, name:string,newname:string){
        this.http.get('webapi/rename/drive?fileid='+id+'&newname='+newname)
        .map(res => res.text())
        .subscribe(
          data => this.resDelete = data,
          err => this.logError(err),
          () => this.resDelete = "le fichier = "+name+"vient d'être renommé à "+newname
        );
        //this.getFilesDrive();
       //newname="testNewName";
    }


    renameFileDropbox(path :string, newname:string){
        this.http.get('webapi/rename/dropbox?pathfile='+path+'&newpath='+newname)
        .map(res => res.text())
        .subscribe(
          data => this.resDelete = data,
          err => this.logError(err),
          () => this.resDelete = "le fichier = "+name+"vient d'être renommé à "+newname
        );
        //this.getFilesDrive();
    }


    logError(err) {
        console.error('There was an error: ' + err);
    }
}


class Folder{
<<<<<<< HEAD
    id : String;
=======
    id: String;
>>>>>>> 96f3d957d577b0773bae993e27d25dbc290b6fe5
    name: String;
    newName :String;
    size: String;
    date: String;
    provide: String;
    owner: String;
    link: String;
    isDir: Boolean;
    isActive : Boolean;
    sons : Array<Folder>;
    
    linkData;
    
<<<<<<< HEAD
    files : string; // instance JSO?
    
constructor(public idFile : String, public nameFolder : String, public sizeF : String, public dte: String, public provideF : String,public own : String, public lnk : String, public isFolder: Boolean){
        this.id=idFile;
=======
    constructor(public idFolder : String,public nameFolder : String,public newnameFolder : String,public sizeF : String,public dte: String,public provideF : String,public own : String,public lnk : String, public isFolder: Boolean){
        this.id = idFolder;
>>>>>>> 96f3d957d577b0773bae993e27d25dbc290b6fe5
        this.name = nameFolder;
        this.newName = newnameFolder;
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
