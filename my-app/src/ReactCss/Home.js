
import React from 'react';


const Home=()=> { 
    
    //variable
    var id=1001,name="kumar",email="kumar@gmail.com";


    //variable_type_obeject_styles
    const variable={
        letterSpacing:'1px',
        wordSpacing:'1px',
        fontSize:'17px',
        color:'green',
        lineheight:'160%',
        textAlign: 'center',
    }
    
    

    return(<>
                <h1 style={{ color:'red',textAlign:'center' }}>React In Line Css</h1>
                <p style={ variable }>
                    virat kohli is the captain of indian cricket team. 
                </p>
                    <ul>
                        <li>{id}</li>
                        <li>{name}</li>
                        <li>{email}</li>
                    </ul>

        </>);
}

export default Home
