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
var files_1 = require('./files');
var HomeComponent = (function () {
    function HomeComponent(http, router) {
        this.http = http;
        this.router = router;
        this.http = http;
        this.router = router;
    }
    HomeComponent.prototype.navigateWithDrive = function () {
        var _this = this;
        this.http.get('http://localhost:8080/webapi/userfiles/drive')
            .map(function (res) { return res.json(); })
            .subscribe(function (data) { return _this.data = data; }, function (err) { return _this.logError(err); }, function () { return _this.navigate(); });
    };
    HomeComponent.prototype.navigateWithDropbox = function () {
        var _this = this;
        this.http.get('http://localhost:8080/webapi/userfiles/dropbox')
            .map(function (res) { return res.json(); })
            .subscribe(function (data) { return _this.data = data; }, function (err) { return _this.navigateWithDrive(); }, function () { return _this.navigate(); });
    };
    HomeComponent.prototype.navigateToFiles = function () {
        this.navigateWithDropbox();
    };
    HomeComponent.prototype.logError = function (err) {
        console.error('There was an error: ' + err);
    };
    HomeComponent.prototype.connectDropbox = function () {
        window.location.href = '/webapi/authorize/dropbox';
    };
    HomeComponent.prototype.connectDrive = function () {
        window.location.href = '/webapi/authorize/drive';
    };
    HomeComponent.prototype.navigate = function () {
        this.router.navigate(['/files']);
    };
    HomeComponent = __decorate([
        core_1.Component({
            selector: 'my-home',
            directives: [common_1.CORE_DIRECTIVES, common_1.FORM_DIRECTIVES, router_2.ROUTER_DIRECTIVES],
            providers: [http_1.HTTP_PROVIDERS],
            templateUrl: './home.html'
        }),
        router_2.Routes([
            { path: '/files', component: files_1.FilesComponent },
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