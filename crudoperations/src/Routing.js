import React from 'react';
import { BrowserRouter, Route }  from 'react-router-dom';
import {Navbar, Nav} from 'react-bootstrap';

import home from './Home/home';
import employee from './Employee/employee';
import about from './About/about';
import contact from './Contact/contact';


const Routing=()=> 
{
    return (<>
<BrowserRouter>
  
    <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
    <Navbar.Brand href="/home">Motivity Labs</Navbar.Brand>
      <Navbar.Toggle aria-controls="responsive-navbar-nav" />
      <Navbar.Collapse id="responsive-navbar-nav">
    <Nav className="mr-auto"></Nav>
    <Nav>
      <Nav.Link href="/home">Home</Nav.Link>
      <Nav.Link href="/employee">Employee</Nav.Link>
      <Nav.Link href="/about">About</Nav.Link>
      <Nav.Link href="/contact">Contact</Nav.Link>
    </Nav>
    </Navbar.Collapse>
    </Navbar> 
                <Route exact path="/" component={home} />
                <Route path="/home" component={home} />
                <Route path="/employee" component={employee} /> 
                <Route path="/about" component={about} />
                <Route path="/contact" component={contact} />
                  
</BrowserRouter> 

    </>)
}


export default Routing  