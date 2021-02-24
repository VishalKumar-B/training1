import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstcomponentComponent } from './firstcomponent/firstcomponent.component';
import { OneComponent } from './one/one.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { RegistrationComponent } from './registration/registration.component';
import { ServicesComponent } from './services/services.component';
import { appRoutes } from './routerConfig';
import { CcontainerComponent } from './ccontainer/ccontainer.component';
import { FormsModule } from '@angular/forms';
//import { AboutComponent } from './about';

@NgModule({
  declarations: [
    AppComponent,
    FirstcomponentComponent,
    OneComponent,
    AboutComponent,
    ContactComponent,
    HomeComponent,
    PagenotfoundComponent,
    RegistrationComponent,
    ServicesComponent,
    CcontainerComponent,
   
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
