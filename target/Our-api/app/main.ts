import { bootstrap }    from '@angular/platform-browser-dynamic';
import {HTTP_BINDINGS} from '@angular/http';
// Add all operators to Observable

import 'rxjs/Rx';

import { AppComponent } from './app.component';

import { HomeComponent } from './home';


bootstrap(HomeComponent, [HTTP_BINDINGS]);
