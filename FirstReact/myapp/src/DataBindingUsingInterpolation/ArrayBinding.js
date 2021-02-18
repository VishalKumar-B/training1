//Services Component...Externally

import React from 'react';

//Services Component
const ArrayBinding=()=> {    

//Arrays
var myArrayBinding=["Web Application","Mobile Application","Content Writing"]

    return(<>
                <h1>SERVICES COMPONENT</h1>
                <p>
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                </p>

                <ul>
                    <li>{ myArrayBinding[0] }</li>
                    <li>{ myArrayBinding[1] }</li>
                    <li>{ myArrayBinding[2] }</li>
                </ul>
                
        </>);
}

export default ArrayBinding
