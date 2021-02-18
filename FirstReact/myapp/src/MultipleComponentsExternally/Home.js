//Home Component...Externally
import React from 'react';


//Import Components
import About from './About.js'
import Services from './Services.js'
import Contact from './Contact.js'


//Home Component
const Home=()=> {    
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

                <hr />
                <About />
                
                <hr />
                <Services />

                <hr />
                <Contact />

        </>);
}

export default Home
