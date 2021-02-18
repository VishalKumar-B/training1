import React from 'react'
import portfolio1 from './images/portfolio-1.jpg';
import portfolio2 from './images/portfolio-2.png';
import portfolio3 from './images/portfolio-3.jpeg';
import portfolio4 from './images/portfolio-4.jpg';
import portfolio5 from './images/portfolio-5.jpg';
import portfolio6 from './images/portfolio-6.png';

const Portfolios=()=> {

    const heights={height:'80%'}
    
    return (<>
                 <div className="container-fluid" style={{ backgroundColor:'#475562' }}>
     
     <div className="container p-5 text-center">

       <h1 className="text-white"> PORTFOLIOS</h1> 

       <ul className="nav justify-content-lg-center py-4">

         <li className="nav-item">
           <a href="#" className="nav-link text-white">ALL</a>
         </li>

         <li className="nav-item">
           <a href="#" className="nav-link text-white">DEVELOPMENT</a>
         </li>

         <li className="nav-item">
           <a href="#" className="nav-link text-white">WEB DESIGN</a>
         </li>

         <li className="nav-item">
           <a href="#" className="nav-link text-white">ILLUSTRATION</a>
         </li>

        

       </ul>


       <div className="row">

         <div className="col-lg-4">
           <img src={portfolio1} className="w-100" style={ heights } />
         </div>

         <div className="col-lg-4">
           <img src={portfolio2} className="w-100" style={ heights }  />
         </div>

         <div className="col-lg-4">
           <img src={portfolio3} className="w-100" style={ heights } />
         </div>

         <div className="col-lg-4">
           <img src={portfolio4} className="w-100" style={ heights }  />
         </div>

         <div className="col-lg-4">
           <img src={portfolio5} className="w-100" style={ heights }  />
         </div>

         <div className="col-lg-4">
           <img src={portfolio6} className="w-100" style={ heights }  />
         </div>
       </div>

     </div>
   </div>

            </>)

}

export default Portfolios
