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
var router_1 = require('@angular/router');
var router_2 = require('@angular/router');
var HomeComponent = (function () {
    function HomeComponent(http, router) {
        this.http = http;
        this.router = router;
        this.http = http;
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
    HomeComponent.prototype.logError = function (err) {
        console.error('There was an error: ' + err);
    };
    HomeComponent.prototype.connectDropbox = function () {
        window.location.href = '/webapi/authorize/dropbox';
    };
    HomeComponent.prototype.connectDrive = function () {
        window.location.href = '/webapi/authorize/drive';
    };
    HomeComponent = __decorate([
        core_1.Component({
            selector: 'my-home',
            directives: [common_1.CORE_DIRECTIVES, common_1.FORM_DIRECTIVES, router_2.ROUTER_DIRECTIVES],
            templateUrl: './home.html'
        }),
        router_2.Routes([
            { path: '/webapi/authorize/dropbox', component: HomeComponent },
            { path: '/webapi/authorize/drive', component: HomeComponent }
        ]), 
        __metadata('design:paramtypes', [http_1.Http, router_1.Router])
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