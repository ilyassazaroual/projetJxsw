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
    constructor(public http: Http, public router: Router) {
       this.http=http;
       this.router = router;
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
    }

    logError(err) {
        console.error('There was an error: ' + err);
    }
    connectDropbox(){
        window.location.href='/webapi/authorize/dropbox';
    }
    connectDrive(){
        window.location.href='/webapi/authorize/drive';
    }
    
    navigate(){
        this.router.navigate(['/files']);
    }
}



class CredentialsModel {
  username: string;
  password: string;
}
