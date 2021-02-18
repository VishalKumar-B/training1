//Home Component...Externally
import React from 'react';
import jumbotron from './images/jumbotron-backgrounds.png';
import profile from './images/profile.jpg';

//Home Component [parent Component]
const Home=()=> { 


    var styles={
            marginBottom:'0rem',
            backgroundImage: "url(" + jumbotron + ")",
            backgroundRepeat:'no-repeat',
            backgroundSize:'100%'
    }

    return(<React.Fragment>
           
<div className="jumbotron text-white" style={styles}>

<div className="container">

    <div className="row">

    <div className="col-lg-6 ">
    
     
        <h1 className="h1 pt-5 mt-5 text-white">I am Vishal kumar</h1>
            <h5 className="bg-success p-2 mt-3 w-75 text-center">Fullstack Developer & Instructor</h5>            
        </div>

        <div className="col-lg-6">
          <img src={profile} width="547" />
         
         



        </div>
    </div>

</div>
</div>

    </React.Fragment>);
}

export default Home
