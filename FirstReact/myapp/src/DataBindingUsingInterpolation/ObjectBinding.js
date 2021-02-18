//About Component...Externally
import React from 'react';

//About Component
const ObjectBinding=()=> {    

var users={
        id:1,
        name:'kumar',
        phone:7896541230,
        email:'kumar@gmail.com'
}

    return(<>
                <h1>ABOUT COMPONENT</h1>
                <p>
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                </p>

                {users.id}-{users.name}-{users.phone}-{users.email}

        </>);
}

export default ObjectBinding
