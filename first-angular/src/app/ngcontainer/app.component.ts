import { Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {


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