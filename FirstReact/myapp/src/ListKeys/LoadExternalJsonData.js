//About Component...Externally
import React from 'react';

//Import External JSONDATA into React Component
import users from './userdata.json';

//LoadExternalJsonData Component
const LoadExternalJsonData=()=> {    

const finalresult=users.map( (result,index)=>{        
     return(<ul key={index}>
                <li> {result.id} </li>
                <li> {result.name} </li>
                <li> {result.email} </li>
                <li> {result.phno} </li>
            </ul>)
})

    return(<>
                <h1>Load External JSON Data</h1>
                { finalresult }
                

        </>);
}

export default LoadExternalJsonData
