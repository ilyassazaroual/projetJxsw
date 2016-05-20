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
            var id = filesDetails.items[i].id;
            var name = filesDetails.items[i].title;
<<<<<<< HEAD
            var newname = filesDetails.items[i].title;
=======
>>>>>>> 25fba6d68ad8a738170ed32f7f1d980445de9f90
            var size = filesDetails.items[i].fileSize + " bytes";
            var date = filesDetails.items[i].createdDate;
            var prov = "drive";
            var own = filesDetails.items[i].ownerNames[0];
            var lien = filesDetails.items[i].embedLink;
            var isDir = false;
            if(filesDetails.items[i].mimeType.indexOf("folder") > -1){
                isDir = true;
            }
<<<<<<< HEAD
            this.folders.push(new Folder(id,name,newname,size,date,prov,own,lien, isDir));
=======
            this.folders.push(new Folder(id,name,size,date,prov,own,lien, isDir));
>>>>>>> 25fba6d68ad8a738170ed32f7f1d980445de9f90
        }
        console.log(this.folders[0]);
    }
    
    consultDataDropbox(){
       // console.log(this.files);
        var filesDetails = JSON.parse(this.files);
        for(var i = 0; i<filesDetails.contents.length; i++){
            var id ="0123idDropbox";
            var name = filesDetails.contents[i].path;
<<<<<<< HEAD
            var newname =filesDetails.contents[i].path;
=======
>>>>>>> 25fba6d68ad8a738170ed32f7f1d980445de9f90
            var size = filesDetails.contents[i].size;
            var date = filesDetails.contents[i].modified;
            var prov = "dropbox"
            var own = "Proprietaire";
            var lien = filesDetails.contents[i].path;
            var isDir = filesDetails.contents[i].is_dir;
            if(filesDetails.contents[i].is_dir=="true"){
                isDir = true;
            }
            
<<<<<<< HEAD
            this.folders.push(new Folder(id,name,newname,size,date,prov,own,lien, isDir));
=======
            this.folders.push(new Folder(id,name,size,date,prov,own,lien, isDir));
>>>>>>> 25fba6d68ad8a738170ed32f7f1d980445de9f90
        }
        console.log(this.folders[0]);
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

<<<<<<< HEAD
    renameFileDrive(id :string, name:string,newname:string){
        this.http.get('webapi/rename/drive?fileid='+id+'&newname='+newname)
=======
    renameFileDrive(id :string, name:string){
        this.http.get('webapi/rename/drive?fileid='+id+'&newname='+name)
>>>>>>> 25fba6d68ad8a738170ed32f7f1d980445de9f90
        .map(res => res.text())
        .subscribe(
          data => this.resDelete = data,
          err => this.logError(err),
<<<<<<< HEAD
          () => this.resDelete = "le fichier = "+name+"vient d'être renommé à "+newname
        );
        //this.getFilesDrive();
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


=======
          () => this.resDelete = "le fichier = "+name+"vient d'être renomé "
        );
        this.getFilesDrive();
    }

>>>>>>> 25fba6d68ad8a738170ed32f7f1d980445de9f90
    logError(err) {
        console.error('There was an error: ' + err);
    }
}


class Folder{
    id: String;
    name: String;
<<<<<<< HEAD
    newName :String;
=======
>>>>>>> 25fba6d68ad8a738170ed32f7f1d980445de9f90
    size: String;
    date: String;
    provide: String;
    owner: String;
    link: String;
    isDir: Boolean;
    isActive : Boolean;
    
<<<<<<< HEAD
    constructor(public idFolder : String,public nameFolder : String,public newnameFolder : String,public sizeF : String,public dte: String,public provideF : String,public own : String,public lnk : String, public isFolder: Boolean){
        this.id = idFolder;
        this.name = nameFolder;
        this.newName = newnameFolder;
=======
    constructor(public idFolder : String,public nameFolder : String,public sizeF : String,public dte: String,public provideF : String,public own : String,public lnk : String, public isFolder: Boolean){
        this.id = idFolder;
        this.name = nameFolder;
>>>>>>> 25fba6d68ad8a738170ed32f7f1d980445de9f90
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
        }
    }
    
    activateRow(){
        this.isActive = !this.isActive;
    }
}
