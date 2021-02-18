//Home Component...Externally
import React from 'react';


//Import Components
import About from '../MultipleComponentsExternally/About';
import Services from '../MultipleComponentsExternally/Services';
import Contact from '../MultipleComponentsExternally/Contact';


//Home Component [parent Component]
const VariableBinding=()=> { 
    
    //variable
    var id=1001,name="kumar",email="kumar@gmail.com"
    

    return(<>
                <h1>HOME COMPONENT</h1>
                <p>
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                </p>

                {id}-{name}-{email}
               
                    <ul>
                        <li>{id}</li>
                        <li>{name}</li>
                        <li>{email}</li>
                    </ul>

                <hr /> 
                <About />
                
                <hr />
                <Services />

                <hr />
                <Contact />

        </>);
}

export default VariableBinding
