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
            if (filesDetails.items[i].parents[0] == undefined || filesDetails.items[i].parents[0].isRoot == true) {
                var id = filesDetails.items[i].id;
                var name = filesDetails.items[i].title;
                var newname = 'new Name'; //filesDetails.contents[i].path;
                var size = filesDetails.items[i].fileSize + " bytes";
                var date = filesDetails.items[i].createdDate;
                var prov = "drive";
                var own = filesDetails.items[i].ownerNames[0];
                var lien = filesDetails.items[i].embedLink;
                var isDir = false;
                if (filesDetails.items[i].mimeType.indexOf("folder") > -1) {
                    isDir = true;
                }
                var folder = new Folder(id, name, newname, size, date, prov, own, lien, isDir);
                if (isDir) {
                    folder.getSons(this.http);
                }
                this.folders.push(folder);
            }
        }
    };
    FilesComponent.prototype.consultDataDropbox = function () {
        var _this = this;
        // console.log(this.files);
        var filesDetails = JSON.parse(this.files);
        for (var i = 0; i < filesDetails.contents.length; i++) {
            var name = filesDetails.contents[i].path;
            var newname = 'new Name'; //filesDetails.contents[i].path;
            var size = (filesDetails.contents[i].size / 1048576) + " Mo";
            var date = filesDetails.contents[i].modified;
            var prov = "dropbox";
            var own = "Proprietaire";
            var linkdata;
            var lien;
            var isDir = filesDetails.contents[i].is_dir;
            if (filesDetails.contents[i].is_dir == "true") {
                isDir = true;
            }
            else if (isDir == false) {
                this.http.get('webapi/preview/dropbox?path=' + name)
                    .map(function (res) { return res.text(); })
                    .subscribe(function (data) { return linkdata = data; }, function (err) { return console.log('There was an error:' + err); }, function () { return lien = _this.getLink(JSON.parse(linkdata)); });
            }
            var folder = new Folder(null, name, newname, size, date, prov, own, lien, isDir);
            if (isDir) {
                folder.getSons(this.http);
            }
            this.folders.push(folder);
        }
    };
    FilesComponent.prototype.getLink = function (linkdata) {
        var lien = linkdata.url;
        return lien;
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
    FilesComponent.prototype.renameFileDrive = function (id, name, newname) {
        var _this = this;
        this.http.get('webapi/rename/drive?fileid=' + id + '&newname=' + newname)
            .map(function (res) { return res.text(); })
            .subscribe(function (data) { return _this.resDelete = data; }, function (err) { return _this.logError(err); }, function () { return _this.resDelete = "le fichier = " + name + "vient d'être renommé à " + newname; });
        //this.getFilesDrive();
        //newname="testNewName";
    };
    FilesComponent.prototype.renameFileDropbox = function (path, newname) {
        var _this = this;
        this.http.get('webapi/rename/dropbox?pathfile=' + path + '&newpath=' + newname)
            .map(function (res) { return res.text(); })
            .subscribe(function (data) { return _this.resDelete = data; }, function (err) { return _this.logError(err); }, function () { return _this.resDelete = "le fichier = " + name + "vient d'être renommé à " + newname; });
        //this.getFilesDrive();
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
    function Folder(idFolder, nameFolder, newnameFolder, sizeF, dte, provideF, own, lnk, isFolder) {
        this.idFolder = idFolder;
        this.nameFolder = nameFolder;
        this.newnameFolder = newnameFolder;
        this.sizeF = sizeF;
        this.dte = dte;
        this.provideF = provideF;
        this.own = own;
        this.lnk = lnk;
        this.isFolder = isFolder;
        this.id = idFolder;
        this.name = nameFolder;
        this.newName = newnameFolder;
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
            this.sons = new Array();
        }
    };
    Folder.prototype.activateRow = function () {
        this.isActive = !this.isActive;
    };
    Folder.prototype.getSons = function (http) {
        var _this = this;
        if (this.id != null) {
            //Partie drive
            http.get('webapi/userfiles/drive')
                .map(function (res) { return res.text(); })
                .subscribe(function (data) { return _this.files = data; }, function (err) { return console.error('There was an error: ' + err); }, function () { return _this.setSonsDrive(http); });
        }
        else {
            http.get('webapi/userfiles/dropbox?path=' + this.name)
                .map(function (res) { return res.text(); })
                .subscribe(function (data) { return _this.files = data; }, function (err) { return console.error('There was an error: ' + err); }, function () { return _this.setSonsDropbox(http); });
        }
    };
    Folder.prototype.setSonsDrive = function (http) {
        var filesDetails = JSON.parse(this.files);
        for (var i = 0; i < filesDetails.items.length; i++) {
            var id = filesDetails.items[i].id;
            var name = filesDetails.items[i].title;
            var newname = 'new name';
            var size = filesDetails.items[i].fileSize + " bytes";
            var date = filesDetails.items[i].createdDate;
            var prov = "drive";
            var own = filesDetails.items[i].ownerNames[0];
            var lien = filesDetails.items[i].embedLink;
            var isDir = false;
            if (filesDetails.items[i].mimeType.indexOf("folder") > -1) {
                isDir = true;
            }
            var folder = new Folder(id, name, newname, size, date, prov, own, lien, isDir);
            if (isDir) {
                folder.getSons(http);
            }
            this.sons.push(folder);
        }
    };
    Folder.prototype.setSonsDropbox = function (http) {
        var _this = this;
        // console.log(this.files);
        var filesDetails = JSON.parse(this.files);
        for (var i = 0; i < filesDetails.contents.length; i++) {
            var name = filesDetails.contents[i].path;
            var newname = 'new name';
            var size = filesDetails.contents[i].size;
            var date = filesDetails.contents[i].modified;
            var prov = "dropbox";
            var own = "Proprietaire";
            var isDir = false;
            if (filesDetails.contents[i].is_dir == "true") {
                isDir = true;
                var folder = new Folder(null, name, newname, size, date, prov, own, "", isDir);
            }
            else if (isDir == false) {
                var folder = new Folder(null, name, newname, size, date, prov, own, "", isDir);
                http.get('webapi/preview/dropbox?path=' + name)
                    .map(function (res) { return res.text(); })
                    .subscribe(function (data) { return _this.linkData = JSON.parse(data); }, function (err) { return console.log('There was an error: ' + err); }, function () { folder = new Folder(null, name, newname, size, date, prov, own, _this.linkData.url, isDir); });
            }
            this.sons.push(folder);
            if (folder.isDir) {
                folder.getSons(http);
            }
        }
    };
    return Folder;
}());
//# sourceMappingURL=files.js.map