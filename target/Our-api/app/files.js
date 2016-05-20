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
        this.resDelete = '';
        this.getFilesDrive();
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
        this.getFilesDropbox();
    };
    FilesComponent.prototype.consultData = function () {
        // console.log(this.files);
        var filesDetails = JSON.parse(this.files);
        for (var i = 0; i < filesDetails.items.length; i++) {
            var id = filesDetails.items[i].id;
            var name = filesDetails.items[i].title;
<<<<<<< HEAD
            var newname = filesDetails.items[i].title;
=======
>>>>>>> 25fba6d68ad8a738170ed32f7f1d980445de9f90
            var size = filesDetails.items[i].fileSize + " bytes";
            var date = filesDetails.items[i].createdDate;
            var prov = "drive";
            var own = filesDetails.items[i].ownerNames[0];
            var lien = filesDetails.items[i].embedLink;
            var isDir = false;
            if (filesDetails.items[i].mimeType.indexOf("folder") > -1) {
                isDir = true;
            }
<<<<<<< HEAD
            this.folders.push(new Folder(id, name, newname, size, date, prov, own, lien, isDir));
=======
            this.folders.push(new Folder(id, name, size, date, prov, own, lien, isDir));
>>>>>>> 25fba6d68ad8a738170ed32f7f1d980445de9f90
        }
        console.log(this.folders[0]);
    };
    FilesComponent.prototype.consultDataDropbox = function () {
        // console.log(this.files);
        var filesDetails = JSON.parse(this.files);
        for (var i = 0; i < filesDetails.contents.length; i++) {
            var id = "0123idDropbox";
            var name = filesDetails.contents[i].path;
<<<<<<< HEAD
            var newname = filesDetails.contents[i].path;
=======
>>>>>>> 25fba6d68ad8a738170ed32f7f1d980445de9f90
            var size = filesDetails.contents[i].size;
            var date = filesDetails.contents[i].modified;
            var prov = "dropbox";
            var own = "Proprietaire";
            var lien = filesDetails.contents[i].path;
            var isDir = filesDetails.contents[i].is_dir;
            if (filesDetails.contents[i].is_dir == "true") {
                isDir = true;
            }
<<<<<<< HEAD
            this.folders.push(new Folder(id, name, newname, size, date, prov, own, lien, isDir));
=======
            this.folders.push(new Folder(id, name, size, date, prov, own, lien, isDir));
>>>>>>> 25fba6d68ad8a738170ed32f7f1d980445de9f90
        }
        console.log(this.folders[0]);
    };
    FilesComponent.prototype.deleteFileDropbox = function (path) {
        var _this = this;
        this.http.get('webapi/delete/dropbox?path=' + path)
            .map(function (res) { return res.text(); })
            .subscribe(function (data) { return _this.resDelete = data; }, function (err) { return _this.logError(err); }, function () { return _this.resDelete = "Suppression réussie fichier supprimé = " + path; });
    };
    FilesComponent.prototype.deleteFileDrive = function (id, name) {
        var _this = this;
        this.http.get('webapi/delete/drive?fileid=' + id)
            .map(function (res) { return res.text(); })
            .subscribe(function (data) { return _this.resDelete = data; }, function (err) { return _this.logError(err); }, function () { return _this.resDelete = "Suppression réussie : fichier supprimé = " + name; });
        this.getFilesDrive();
    };
<<<<<<< HEAD
    FilesComponent.prototype.renameFileDrive = function (id, name, newname) {
        var _this = this;
        this.http.get('webapi/rename/drive?fileid=' + id + '&newname=' + newname)
            .map(function (res) { return res.text(); })
            .subscribe(function (data) { return _this.resDelete = data; }, function (err) { return _this.logError(err); }, function () { return _this.resDelete = "le fichier = " + name + "vient d'être renommé à " + newname; });
        //this.getFilesDrive();
    };
    FilesComponent.prototype.renameFileDropbox = function (path, newname) {
        var _this = this;
        this.http.get('webapi/rename/dropbox?pathfile=' + path + '&newpath=' + newname)
            .map(function (res) { return res.text(); })
            .subscribe(function (data) { return _this.resDelete = data; }, function (err) { return _this.logError(err); }, function () { return _this.resDelete = "le fichier = " + name + "vient d'être renommé à " + newname; });
        //this.getFilesDrive();
=======
    FilesComponent.prototype.renameFileDrive = function (id, name) {
        var _this = this;
        this.http.get('webapi/rename/drive?fileid=' + id + '&newname=' + name)
            .map(function (res) { return res.text(); })
            .subscribe(function (data) { return _this.resDelete = data; }, function (err) { return _this.logError(err); }, function () { return _this.resDelete = "le fichier = " + name + "vient d'être renomé "; });
        this.getFilesDrive();
>>>>>>> 25fba6d68ad8a738170ed32f7f1d980445de9f90
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
<<<<<<< HEAD
    function Folder(idFolder, nameFolder, newnameFolder, sizeF, dte, provideF, own, lnk, isFolder) {
        this.idFolder = idFolder;
        this.nameFolder = nameFolder;
        this.newnameFolder = newnameFolder;
=======
    function Folder(idFolder, nameFolder, sizeF, dte, provideF, own, lnk, isFolder) {
        this.idFolder = idFolder;
        this.nameFolder = nameFolder;
>>>>>>> 25fba6d68ad8a738170ed32f7f1d980445de9f90
        this.sizeF = sizeF;
        this.dte = dte;
        this.provideF = provideF;
        this.own = own;
        this.lnk = lnk;
        this.isFolder = isFolder;
        this.id = idFolder;
        this.name = nameFolder;
<<<<<<< HEAD
        this.newName = newnameFolder;
=======
>>>>>>> 25fba6d68ad8a738170ed32f7f1d980445de9f90
        this.size = sizeF;
        this.date = dte;
        this.provide = provideF;
        this.owner = own;
        this.link = lnk;
        this.isDir = isFolder;
        this.isActive = false;
        this.adaptFolder();
    }
    Folder.prototype.adaptFolder = function () {
        if (this.isDir) {
            this.name += "/";
        }
    };
    Folder.prototype.activateRow = function () {
        this.isActive = !this.isActive;
    };
    return Folder;
}());
//# sourceMappingURL=files.js.map