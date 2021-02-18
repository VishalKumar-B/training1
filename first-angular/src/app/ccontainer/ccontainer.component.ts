import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ccontainer',
  templateUrl: './ccontainer.component.html',
  styleUrls: ['./ccontainer.component.css']
})
export class CcontainerComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  public Employees:any[] = 
[
   	{ EmpName: 'Robert', Dept: 'HR'},
    { EmpName: 'Julie', Dept: 'HR'},
    { EmpName: 'Albert', Dept: 'Finance'},
    { EmpName: 'Michael', Dept: 'Account'},
    { EmpName: 'Jolly', Dept: 'Account'},
    { EmpName: 'German', Dept: 'Finance'}
]; 

}
