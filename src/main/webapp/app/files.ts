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
        this.getFilesDropbox();
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
    }
    
    consultData(){
        console.log(this.files);
    }
    
    consultDataDropbox(){
        console.log(this.files);
        var filesDetails = JSON.parse(this.files);
        for(var i = 0; i<filesDetails.contents.length; i++){
            this.folders.push(new Folder(filesDetails.contents[i].path));
        }
        console.log(this.folders[0]);
    }
    

    logError(err) {
        console.error('There was an error: ' + err);
    }
}



class Folder{
    name: String;
    constructor(public nameFolder : String){
        this.name = nameFolder;
    }
}
