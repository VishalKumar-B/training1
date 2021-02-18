import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { RegistrationComponent } from './registration/registration.component';
import { ServicesComponent } from './services/services.component';
import { ContactComponent } from './contact/contact.component';

export const appRoutes: Routes = [
  { 
      path: 'home', 
      component: HomeComponent 
  },
  {
    path: 'about',
    component: AboutComponent
  },
  { 
      path: 'registration',
        component: RegistrationComponent
  },
  {
      path: 'services',
      component: ServicesComponent
  },
  {
      path: 'contact',
      component: ContactComponent
  }
];