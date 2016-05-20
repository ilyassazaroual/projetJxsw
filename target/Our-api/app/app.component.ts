import {bootstrap}    from '@angular/platform-browser-dynamic';
import {Component} from '@angular/core';
import {CORE_DIRECTIVES, FORM_DIRECTIVES} from '@angular/common';
import {Http, Headers,  HTTP_PROVIDERS, HTTP_BINDINGS} from '@angular/http';
import {NgForm} from '@angular/common';



@Component({
    selector: 'my-app',
    directives: [ CORE_DIRECTIVES, FORM_DIRECTIVES ],
    templateUrl: './app.html'

})
export class AppComponent {
   constructor(public http: Http) {
       this.http=http;
   }
    

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

        this.http.post('http://localhost:8080/webapi/service/auth', creds, {
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
    
}



class CredentialsModel {
  username: string;
  password: string;
}
