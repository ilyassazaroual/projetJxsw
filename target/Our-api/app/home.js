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
        this.testInfos = "testtestestesttetstetstetst";
        //this.userInfos = new User("testUserInfos!","Driv 0","Drop 0");
        //console.log("=================constructeur============"+this.userInfos);
    }
    HomeComponent.prototype.getUserInfo = function () {
        var _this = this;
        this.http.get('webapi/userinfo/drive')
            .map(function (res) { return res.text(); })
            .subscribe(function (data) { return _this.data = data; }, function (err) { return _this.logError(err); }, function () { return _this.consultUserInfoDrive(); });
        this.getUserInfoDrop();
    };
    HomeComponent.prototype.getUserInfoDrop = function () {
        var _this = this;
        this.http.get('webapi/userinfo/dropbox')
            .map(function (res) { return res.text(); })
            .subscribe(function (data) { return _this.data = data; }, function (err) { return _this.logError(err); }, function () { return _this.consultUserInfoDrop(); });
    };
    HomeComponent.prototype.consultUserInfoDrive = function () {
        var infos = JSON.parse(this.data);
        console.log(infos);
        console.log("drive!!!" + infos.name);
        this.name = infos.name;
        this.cotaDrTotal = infos.quotaBytesTotal;
        console.log("drive quotaT!!" + infos.quotaBytesTotal);
        this.cotaDrUsed = infos.quotaBytesUsed;
        console.log("drive quotaU!!" + infos.quotaBytesUsed);
        this.emailDriv = infos.user.emailAddress;
        console.log("drive@mail!!" + infos.user.emailAddress);
    };
    HomeComponent.prototype.consultUserInfoDrop = function () {
        var infos = JSON.parse(this.data);
        console.log("drop quotaT!!!" + infos.quota_info.quota);
        this.cotaDropTotal = infos.quota_info.quota;
        this.cotaDropUsed = infos.quota_info.normal;
        console.log("drop quotaU!!!" + infos.quota_info.normal);
        this.emailDrop = infos.email;
        console.log("drop email!!!" + this.emailDrop);
        this.userInfos = new User(this.name, this.cotaDrTotal, this.cotaDrUsed, this.cotaDropTotal, this.cotaDropUsed, this.emailDriv, this.emailDrop);
        console.log("###########" + this.name + " ctDrT :" + this.cotaDrTotal + " ctdrU :" + this.cotaDrUsed + " ctDpT:" + this.cotaDropTotal + " ctDpU: " + this.cotaDropUsed + " maiDv :" + this.emailDriv + " mailDp :" + this.emailDrop);
        console.log(this.userInfos);
    };
    HomeComponent.prototype.navigateWithDrive = function () {
        var _this = this;
        this.http.get('webapi/userfiles/drive')
            .map(function (res) { return res.json(); })
            .subscribe(function (data) { return _this.data = data; }, function (err) { return _this.logError(err); }, function () { return _this.navigate(); });
    };
    HomeComponent.prototype.navigateWithDropbox = function () {
        var _this = this;
        this.http.get('webapi/userfiles/dropbox')
            .map(function (res) { return res.json(); })
            .subscribe(function (data) { return _this.data = data; }, function (err) { return _this.navigateWithDrive(); }, function () { return _this.navigate(); });
    };
    HomeComponent.prototype.navigateToFiles = function () {
        this.navigateWithDropbox();
        // this.getUserInfo()
    };
    HomeComponent.prototype.logError = function (err) {
        console.error('There was an error: ' + err);
    };
    HomeComponent.prototype.connectDropbox = function () {
        window.location.href = '/webapi/authorize/dropbox';
        //this.getUserInfo();
        //console.log("!!!!!!!!!!!!!!!!!!!!!!!!"+this.userInfos+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    };
    HomeComponent.prototype.connectDrive = function () {
        window.location.href = '/webapi/authorize/drive';
    };
    HomeComponent.prototype.navigate = function () {
        this.router.navigate(['/files']);
        this.getUserInfo();
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
var User = (function () {
    function User(name, cotadrv, cotadrvUsed, cotadrp, cotadrpUsed, maildrv, maildrop) {
        this.name = name;
        this.cotadrv = cotadrv;
        this.cotadrvUsed = cotadrvUsed;
        this.cotadrp = cotadrp;
        this.cotadrpUsed = cotadrpUsed;
        this.maildrv = maildrv;
        this.maildrop = maildrop;
        this.username = name;
        this.emailDrv = maildrv;
        this.emailDrop = maildrop;
        this.cotaDropboxTotal = cotadrp;
        this.cotaDriveTotal = cotadrv;
        this.cotaDriveUsed = cotadrvUsed;
        this.cotaDopboxUsed = cotadrpUsed;
    }
    return User;
}());
//# sourceMappingURL=home.js.map