import {bootstrap}    from '@angular/platform-browser-dynamic';
import {Component} from '@angular/core';
import {CORE_DIRECTIVES, FORM_DIRECTIVES} from '@angular/common';
import {Http, Headers} from '@angular/http';
import {NgForm} from '@angular/common';
import {Router} from '@angular/router';
import { ROUTER_DIRECTIVES, Routes } from '@angular/router';




@Component({
    selector: 'my-home',
    directives: [ CORE_DIRECTIVES, FORM_DIRECTIVES, ROUTER_DIRECTIVES ],
    templateUrl: './home.html'

})
@Routes([
   { path: '/webapi/authorize/dropbox', component: HomeComponent },
   { path: '/webapi/authorize/drive', component: HomeComponent }
])
export class HomeComponent {
constructor(public http: Http, public router: Router) {
       this.http=http;
       this.router = router;
   }
    
    /*getRandomQuote() {
        this.http.get('http://localhost:3001/api/random-quote')
        .map(res => res.text())
        .subscribe(
          data => this.randomQuote = data,
          err => this.logError(err),
          () => console.log('Random Quote Complete')
        );
    }*/

    logError(err) {
        console.error('There was an error: ' + err);
    }
    connectDropbox(){
        window.location.href='/webapi/authorize/dropbox';
    }
    connectDrive(){
        window.location.href='/webapi/authorize/drive';
    }
}

}



class CredentialsModel {
  username: string;
  password: string;
}
