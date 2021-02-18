import React from 'react';
import { BrowserRouter, Route, Switch, Redirect }  from 'react-router-dom';


//import Information/view Components...
import Header from './Header.js';
import Footer from '../RoutingExample3/components/Footer.js';

import Home from '../RoutingExample3/components/Home.js';
import About from '../RoutingExample3/components/About.js';
import Services from '../RoutingExample3/components/Services.js';
import Blog from '../RoutingExample3/components/Blog.js';
import Portfolios from '../RoutingExample3/components/Portfolios.js';
import Contact from '../RoutingExample3/components/Contact.js';
import Propsobject from '../PropsObject/PropsObject.js';
import Pagenotfound from '../RoutingExample3/components/Pagenotfound.js';
import Courses from './Courses';



const Routings=()=> 
{
    return (<>

<BrowserRouter>

               {/* navbar Component */ }
               
                <Header />   
               
               {/* navbar Component */ }
              
            <Switch>
                <Route exact path="/" component={Home} />
                <Route path="/home" component={Home} />
                <Route path="/about" component={About} />
                <Route path="/services" component={Services} />
                <Route path="/portfolios" component={Portfolios} />
                <Route path="/blog" component={Blog} /> 
                <Route path="/contact" component={Contact} />
                <Route path="/props" component={Propsobject} />
                <Route path="/courses" component={Courses} />
                <Redirect to="/home" />
                <Route  component={Pagenotfound} />
            </Switch>


                  {/* Footer Component */ }
               
                  <Footer /> 
               
                  {/* Footer Component */ }

                
</BrowserRouter>

    </>)
}


export default Routings