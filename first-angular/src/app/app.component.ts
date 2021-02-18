import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  title = 'first-angular';
  s: string = "welcome to type script";
  constructor() {
    console.log(this.s)
  }
  
  
}
