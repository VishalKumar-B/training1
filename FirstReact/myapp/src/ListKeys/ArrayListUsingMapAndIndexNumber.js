//Services Component...Externally

import React from 'react';

//Services Component
const ArrayListUsingMapAndIndexNumber=()=> {    

//Arrays
var myservices=["Web Application","Mobile Application","Content Writing"]

    //JSX
    return(<>
                <h1>ArrayList Using Map And IndexNumber</h1>
                
               <ul type="none">
                    {
                        myservices.map( (result,index)=>   <li> {index+1}.{ result } </li> )    
                    }
               </ul>



    
              
        </>);
}

export default ArrayListUsingMapAndIndexNumber
