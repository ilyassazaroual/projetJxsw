"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require('@angular/core');
var common_1 = require('@angular/common');
var http_1 = require('@angular/http');
var HomeComponent = (function () {
    function HomeComponent(http) {
        this.http = http;
        this.http = http;
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
    HomeComponent.prototype.logError = function (err) {
        console.error('There was an error: ' + err);
    };
    HomeComponent.prototype.authenticate = function (data) {
        var _this = this;
        console.log("salut");
        console.log('you submitted value:', data.credentials.username);
        var username = data.credentials.username;
        var password = data.credentials.password;
        var creds = "log=" + username + "&mp=" + password;
        var headers = new http_1.Headers();
        headers.append('Content-Type', 'application/x-www-form-urlencoded');
        this.http.post('http://localhost:9000/rest/service/auth', creds, {
            headers: headers
        })
            .map(function (res) { return res.json(); })
            .subscribe(function (data) { return _this.saveJwt(data.id_token); }, function (err) { return _this.logError(err); }, function () { return _this.consultRes(data); });
    };
    HomeComponent.prototype.consultRes = function (res) {
        if (res.equals("OK")) {
            console.log('Authentication Accepted');
        }
        console.log('Authentication Complete');
    };
    HomeComponent.prototype.saveJwt = function (jwt) {
        if (jwt) {
            localStorage.setItem('id_token', jwt);
        }
    };
    HomeComponent = __decorate([
        core_1.Component({
            selector: 'my-home',
            directives: [common_1.CORE_DIRECTIVES, common_1.FORM_DIRECTIVES],
            templateUrl: './home.html'
        }), 
        __metadata('design:paramtypes', [http_1.Http])
    ], HomeComponent);
    return HomeComponent;
}());
exports.HomeComponent = HomeComponent;
var CredentialsModel = (function () {
    function CredentialsModel() {
    }
    return CredentialsModel;
}());
//# sourceMappingURL=home.js.map