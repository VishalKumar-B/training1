//Services Component...Externally

import React from 'react';

//Services Component
const ArrayListUsingMap=()=> {    

//Arrays
var myservices=["Web Application","Mobile Application","Content Writing"]

    //JSX
    return(<>
                <h1>Array List Using Map</h1>

                {
                    myservices.map( (result)=>   <li> { result } </li> )    
                }



    
              
        </>);
}

export default ArrayListUsingMap
