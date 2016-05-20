import {bootstrap}    from '@angular/platform-browser-dynamic';
import {Component} from '@angular/core';
import {CORE_DIRECTIVES, FORM_DIRECTIVES} from '@angular/common';
import {Http, Headers, HTTP_PROVIDERS} from '@angular/http';
import {NgForm} from '@angular/common';
import {Router} from '@angular/router';
import { ROUTER_DIRECTIVES, Routes } from '@angular/router';
import {FilesComponent} from './files';




@Component({
    selector: 'my-home',
    directives: [ CORE_DIRECTIVES, FORM_DIRECTIVES, ROUTER_DIRECTIVES ],
    providers: [HTTP_PROVIDERS],
    templateUrl: './home.html'

})
@Routes([
   { path: '/files', component: FilesComponent },
])
export class HomeComponent {
    public data;
    public userInfos : User;
    public name : string;
<<<<<<< HEAD
    public cotaDrTotal :string;
    public cotaDrUsed :string;
    public emailDriv :string;
    public cotaDropTotal :string;
    public cotaDropUsed :string;
    public emailDrop :string;
    public testInfos:string 
    constructor(public http: Http, public router: Router) {
       this.http=http;
       this.router = router;
       this.testInfos="testtestestesttetstetstetst";
=======
    public cotaDrTotal :number;
    public cotaDrUsed :number;
    public emailDriv :string;
    public cotaDropTotal :number;
    public cotaDropUsed :number;
    public emailDrop :string;
    public auth:boolean; 
    constructor(public http: Http, public router: Router) {
       this.http=http;
       this.router = router;
       this.auth = false;
>>>>>>> 96f3d957d577b0773bae993e27d25dbc290b6fe5
       //this.userInfos = new User("testUserInfos!","Driv 0","Drop 0");
       //console.log("=================constructeur============"+this.userInfos);
    }

    getUserInfo(){
      this.http.get('webapi/userinfo/drive')
        .map(res => res.text())
        .subscribe(
          data => this.data = data,
          err => this.logError(err),
          () => this.consultUserInfoDrive()
        );
        this.getUserInfoDrop();
    }
    
    getUserInfoDrop(){
       this.http.get('webapi/userinfo/dropbox')
        .map(res => res.text())
        .subscribe(
          data => this.data = data,
          err => this.logError(err),
          () => this.consultUserInfoDrop()
        );

    }

    consultUserInfoDrive(){
      var infos = JSON.parse(this.data)
      console.log(infos);
       console.log("drive!!!"+infos.name);
       this.name = infos.name;
<<<<<<< HEAD
       this.cotaDrTotal = infos.quotaBytesTotal; console.log("drive quotaT!!"+infos.quotaBytesTotal);
       this.cotaDrUsed  = infos.quotaBytesUsed;  console.log("drive quotaU!!"+infos.quotaBytesUsed);
=======
       this.cotaDrTotal = Number(infos.quotaBytesTotal/1048576); console.log("drive quotaT!!"+infos.quotaBytesTotal/1048576);
       this.cotaDrUsed  = Number(infos.quotaBytesUsed/1048576);  console.log("drive quotaU!!"+infos.quotaBytesUsed);
>>>>>>> 96f3d957d577b0773bae993e27d25dbc290b6fe5
       this.emailDriv = infos.user.emailAddress;       console.log("drive@mail!!"+infos.user.emailAddress);
    }

     consultUserInfoDrop(){
      var infos = JSON.parse(this.data)
       console.log("drop quotaT!!!"+infos.quota_info.quota);
<<<<<<< HEAD
       this.cotaDropTotal = infos.quota_info.quota;
       this.cotaDropUsed  = infos.quota_info.normal; console.log("drop quotaU!!!"+infos.quota_info.normal);
=======
       this.cotaDropTotal = Number(infos.quota_info.quota/1048576);
       this.cotaDropUsed  = Number(infos.quota_info.normal/1048576); console.log("drop quotaU!!!"+infos.quota_info.normal);
>>>>>>> 96f3d957d577b0773bae993e27d25dbc290b6fe5
       this.emailDrop = infos.email; console.log("drop email!!!"+this.emailDrop);
       this.userInfos = new User(this.name,this.cotaDrTotal,this.cotaDrUsed,this.cotaDropTotal,
        this.cotaDropUsed,this.emailDriv,this.emailDrop);
       console.log("###########"+this.name+" ctDrT :"+this.cotaDrTotal+" ctdrU :"+this.cotaDrUsed+" ctDpT:"+this.cotaDropTotal+" ctDpU: "+this.cotaDropUsed+" maiDv :"+this.emailDriv+" mailDp :"+this.emailDrop);
       console.log(this.userInfos);
    }
    navigateWithDrive() {
        this.http.get('webapi/userfiles/drive')
        .map(res => res.json())
        .subscribe(
          data => this.data = data,
            err => this.logError(err),
          () => this.navigate()
        );
    }
    
    
    navigateWithDropbox() {
        this.http.get('webapi/userfiles/dropbox')
        .map(res => res.json())
        .subscribe(
          data => this.data = data,
            err => this.navigateWithDrive(),
          () => this.navigate()
        );
    }
    
    navigateToFiles(){
       this.navigateWithDropbox();
      // this.getUserInfo()
    }

    logError(err) {
        console.error('There was an error: ' + err);
    }
    connectDropbox(){
        window.location.href='/webapi/authorize/dropbox';
<<<<<<< HEAD
        //this.getUserInfo();
=======
        this.auth = true;
>>>>>>> 96f3d957d577b0773bae993e27d25dbc290b6fe5
        //console.log("!!!!!!!!!!!!!!!!!!!!!!!!"+this.userInfos+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    connectDrive(){
        window.location.href='/webapi/authorize/drive';
        this.auth = true;
    }
    
    navigate(){
        this.router.navigate(['/files']);
        this.getUserInfo();

    }
}



class User {
  public username: string;
  public emailDrv :string;
<<<<<<< HEAD
  public cotaDriveTotal: string;
  public cotaDriveUsed :string;
  public cotaDropboxTotal : string;
  public cotaDopboxUsed :string;
  public emailDrop :string;

  constructor(public name:string, public cotadrv:string,public cotadrvUsed:string, public cotadrp:string, public cotadrpUsed:string, public maildrv:string, public maildrop:string){
=======
  public cotaDriveTotal: number;
  public cotaDriveUsed :number;
  public cotaDropboxTotal : number;
  public cotaDopboxUsed :number;
  public emailDrop :string;

  constructor(public name:string, public cotadrv:number,public cotadrvUsed:number, public cotadrp:number, public cotadrpUsed:number, public maildrv:string, public maildrop:string){
>>>>>>> 96f3d957d577b0773bae993e27d25dbc290b6fe5
    this.username = name;
    this.emailDrv = maildrv;
    this.emailDrop = maildrop;
    this.cotaDropboxTotal = cotadrp;
    this.cotaDriveTotal = cotadrv;
    this.cotaDriveUsed = cotadrvUsed;
    this.cotaDopboxUsed = cotadrpUsed;
   }
}
