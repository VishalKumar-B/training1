//Services Component...Externally

import React from 'react';

//Services Component
const Example1=()=> {    

//Arrays
var myservices=["Web Application","Mobile Application","Content Writing","Web Application"]

    //JSX
    return(<>
                <h1 className="text-center">React Boot Strap </h1>

               <ul className="list-group w-25">
                    {
                        myservices.map( (result,index)=>   <li className="list-group-item active" key={index+1}> {index+1}.{ result } </li> )    
                    }
               </ul>



    
              
        </>);
}

export default Example1
