//Home Component...Externally
import React from 'react';


//Import Components
import About from '../MultipleComponentsExternally/About';
import Services from '../MultipleComponentsExternally/Services';
import Contact from '../MultipleComponentsExternally/Contact';


//Home Component [parent Component]
const Inline=()=> { 
    
    //variable
    var id=1001,name="kumar",email="kumar@gmail.com"


    //variable_type_obeject_styles
    const variable={
        letterSpacing:'1px',
        wordSpacing:'1px',
        fontSize:'17px',
        color:'green',
        lineheight:'160%',
        'text-align':'justify',
        'border-style':'double'
    }
    
    

    return(<>
                <h1 style={{ color:'red',textAlign:'center' }}>In line css</h1>
                <p style={ variable }>
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                </p>

              
               
                    <ul>
                        <li>{id}</li>
                        <li>{name}</li>
                        <li>{email}</li>
                    </ul>

                {/* <hr /> 
                <About /> 
                
                <hr />
                <Services />

                <hr />
                <Contact />  */}

        </>);
}

export default Inline
