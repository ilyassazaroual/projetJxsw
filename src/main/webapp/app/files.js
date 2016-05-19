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
var FilesComponent = (function () {
    function FilesComponent(http) {
        this.http = http;
        this.folders = new Array();
        this.http = http;
        this.username = "";
        this.getFilesDropbox();
    }
    FilesComponent.prototype.getFilesDropbox = function () {
        var _this = this;
        this.http.get('webapi/userfiles/dropbox')
            .map(function (res) { return res.text(); })
            .subscribe(function (data) { return _this.files = data; }, function (err) { return _this.logError(err); }, function () { return _this.consultDataDropbox(); });
    };
    FilesComponent.prototype.getFilesDrive = function () {
        var _this = this;
        this.http.get('webapi/userfiles/drive')
            .map(function (res) { return res.text(); })
            .subscribe(function (data) { return _this.files = data; }, function (err) { return _this.logError(err); }, function () { return _this.consultData(); });
    };
    FilesComponent.prototype.consultData = function () {
        console.log(this.files);
    };
    FilesComponent.prototype.consultDataDropbox = function () {
        console.log(this.files);
        var filesDetails = JSON.parse(this.files);
        for (var i = 0; i < filesDetails.contents.length; i++) {
            this.folders.push(new Folder(filesDetails.contents[i].path));
        }
        console.log(this.folders[0]);
    };
    FilesComponent.prototype.logError = function (err) {
        console.error('There was an error: ' + err);
    };
    FilesComponent = __decorate([
        core_1.Component({
            selector: 'my-files',
            directives: [common_1.CORE_DIRECTIVES, common_1.FORM_DIRECTIVES, router_1.ROUTER_DIRECTIVES],
            templateUrl: './files.html'
        }), 
        __metadata('design:paramtypes', [http_1.Http])
    ], FilesComponent);
    return FilesComponent;
}());
exports.FilesComponent = FilesComponent;
var Folder = (function () {
    function Folder(nameFolder) {
        this.nameFolder = nameFolder;
        this.name = nameFolder;
    }
    return Folder;
}());
//# sourceMappingURL=files.js.map