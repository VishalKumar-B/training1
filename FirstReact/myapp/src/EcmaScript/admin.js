// Admin js_Module

/*
import uname from './user.js'
import { myfun,users }  from './user.js'
*/

//Both default export, normal exports also
import uname,{ myfun,users } from './user.js'

//admin statements
var aname="admin";


//user Statements...
document.write(uname)


document.getElementById('root').innerText=`${aname}-${uname} -${ myfun()} -${ users } `
