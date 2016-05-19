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
        console.log(this.files);
        var filesDetails = JSON.parse(this.files);

        for(var i = 0; i<filesDetails.items.length; i++){
            var name = filesDetails.items[i].title;
            var size = filesDetails.items[i].fileSize;
            var date = filesDetails.items[i].createdDate;
            var prov = "drive";
            var own = filesDetails.items[i].owners.displayName;
            var lien = filesDetails.items[i].embedLink;
            this.folders.push(new Folder(name,size,date,prov,own,lien));
        }
    }
    
    consultDataDropbox(){
        console.log(this.files);
        var filesDetails = JSON.parse(this.files);
        for(var i = 0; i<filesDetails.contents.length; i++){
            var name = filesDetails.contents[i].path;
            var size = filesDetails.contents[i].size;
            var date = filesDetails.contents[i].modified;
            var prov = "dropbox"
            var own = "Proprietaire";
            var lien = filesDetails.contents[i].path;
            this.folders.push(new Folder(name,size,date,prov,own,lien));
        }
        console.log(this.folders[0]);
    }
    

    logError(err) {
        console.error('There was an error: ' + err);
    }
}


class Folder{
    name: String;
    size: String;
    date: String;
    provide: String;
    owner: String;
    link: String;
    constructor(public nameFolder : String,public sizeF : String,public dte: String,public provideF : String,public own : String,public lnk : String){
        this.name = nameFolder;
        this.size = sizeF;
        this.date = dte;
        this.provide =provideF;
        this.owner = own;
        this.link = lnk;
    }
}
