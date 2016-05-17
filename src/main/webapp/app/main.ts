import { bootstrap }    from '@angular/platform-browser-dynamic';
import {HTTP_PROVIDERS} from '@angular/http';
// Add all operators to Observable

import 'rxjs/Rx';

import { AppComponent } from './app.component';

import { HomeComponent } from './home';

import {ROUTER_PROVIDERS} from '@angular/router';


bootstrap(HomeComponent, [HTTP_PROVIDERS, ROUTER_PROVIDERS]);
