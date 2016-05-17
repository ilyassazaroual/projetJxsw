import {bootstrap}    from '@angular/platform-browser-dynamic';
import {Component} from '@angular/core';
import {CORE_DIRECTIVES, FORM_DIRECTIVES} from '@angular/common';
import {Http, Headers,  HTTP_PROVIDERS, HTTP_BINDINGS} from '@angular/http';
import {NgForm} from '@angular/common';



@Component({
    selector: 'my-home',
    directives: [ CORE_DIRECTIVES, FORM_DIRECTIVES ],
    templateUrl: './home.html'

})
export class HomeComponent {
   constructor(public http: Http) {
       this.http=http;
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
    
    authenticate(data :any) {
        console.log("salut");
        console.log('you submitted value:', data.credentials.username);  
        var username = data.credentials.username;
        var password = data.credentials.password;

        var creds = "log=" + username + "&mp=" + password;

        var headers = new Headers();
        headers.append('Content-Type', 'application/x-www-form-urlencoded');

        this.http.post('http://localhost:9000/rest/service/auth', creds, {
            headers: headers
        })
        .map(res => res.json())
        .subscribe(
          data => this.saveJwt(data.id_token),
          err => this.logError(err),
          () =>   this.consultRes(data)
        );
    }
    
    consultRes(res){
        if(res.equals("OK")){
                console.log('Authentication Accepted');
        } console.log('Authentication Complete')
        
    }

    saveJwt(jwt) {
        if(jwt) {
            localStorage.setItem('id_token', jwt)
        }
    }
    
   /* getSecretQuote() {

        var jwt = localStorage.getItem('id_token');
        var authHeader = new Headers();
        if(jwt) {
            authHeader.append('Authorization', 'Bearer ' + jwt);      
        }

        this.http.get('http://localhost:3001/api/protected/random-quote', {
            headers: authHeader
        })
        .map(res => res.text())
        .subscribe(
            data => this.secretQuote = data,
            err => this.logError(err),
            () => console.log('Secret Quote Complete')
        );

    }*/

}



class CredentialsModel {
  username: string;
  password: string;
}
