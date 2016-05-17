"use strict";
var platform_browser_dynamic_1 = require('@angular/platform-browser-dynamic');
var http_1 = require('@angular/http');
// Add all operators to Observable
require('rxjs/Rx');
var home_1 = require('./home');
platform_browser_dynamic_1.bootstrap(home_1.HomeComponent, [http_1.HTTP_BINDINGS]);
//# sourceMappingURL=main.js.map