import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-firstcomponent',
  template: `
    <h2>Hi! {{"welcome " +name}} </h2>
    <h2>length of the name is: {{name.length}}</h2>
    <h3>{{name.toUpperCase()}}</h3>
    <h4>{{mobile()}}</h4>
    {{siteurl}}
  `,
  styleUrls: ['./firstcomponent.component.css']
})
export class FirstcomponentComponent implements OnInit {

  public name = "vishal";
  public siteurl = window.location.href;
  constructor() { }
 
  ngOnInit(): void {
  }
  mobile() {
    return "mobile: 8187862946 Name: "+this.name;
  }
}
