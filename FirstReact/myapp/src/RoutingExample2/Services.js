//Services Component...Externally

import React from 'react';

//Services Component
const Services=()=> {    

//Arrays
var myservices=["Web Application","Mobile Application","Content Writing","Web Application"]

    //JSX
    return(<>
                <React.Fragment>
            <div className="container py-5">
              <h1>SERVICES COMPONENT</h1>
                
                </div>
    </React.Fragment>
                
                

               {/* <ul className="list-group w-25">
                    {
                        myservices.map( (result,index)=>   <li className="list-group-item" key={index+1}> {index+1}.{ result } </li> )    
                    }
               </ul> */}



    
              
        </>);
}

export default Services
