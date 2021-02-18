//About Component...Externally
import React from 'react';


//import External CSS
import './style.css';

//About Component
const External=()=> {    

const finalresult=()=>{        
     return(<ul>
                <li> react </li>
                <li> angular </li>
                <li> vue </li>
                <li> node </li>
            </ul>)
}

    return(<>
                <h1 className="h1">In External Css</h1>
                <p  className="p">
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                </p>

                { finalresult() }

        </>);
}

export default External
