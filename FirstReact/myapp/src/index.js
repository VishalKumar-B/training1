//import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import React, { Fragment } from 'react';
//import Home from './ExternalComponent/Home';
//import Home from './MultipleComponentsExternally/Home';
import VariableBinding from './DataBindingUsingInterpolation/VariableBinding';
import ArrayBinding from './DataBindingUsingInterpolation/ArrayBinding';
import ObjectBinding from './DataBindingUsingInterpolation/ObjectBinding';
import FunctionBinding from './DataBindingUsingInterpolation/FunctionBinding';
import ArrayListUsingMap from './ListKeys/ArrayLIstUsingMap';
import ArrayListUsingMapAndIndexNumber from './ListKeys/ArrayListUsingMapAndIndexNumber';
import Inline from './ReactCSS/Inline';
import External from './ReactCSS/External';
import './../node_modules/bootstrap/dist/css/bootstrap.min.css'; //importing bootstrap package
import Example1 from './ReactBootstrap/Example1';
import ObjectTypeArrayListUsingMap from './ListKeys/ObjectTypeArrayListUsingMap';
import ObjectTypeArrayListUsingMap2 from './ListKeys/ObjectTypeArrayListUsingMap2';
import LoadExternalJsonData from './ListKeys/LoadExternalJsonData';
//import Routings from './RoutingExample1/Routings';
//import Routings from './RoutingExample2/Routings';
import './../node_modules/bootstrap/dist/css/bootstrap.min.css';
//import Routings from './RoutingExample3/components/Routings';
import Propsobject from './PropsObject/PropsObject';
import Routings from './NestedRouting/Routings';
//import StateObject from './StateObjectAndEvents/StateObject';
import StateObject1 from './StateObjectAndEvents/StateObject1';

/*
ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')      
);
*/

//State Object and Events
//ReactDOM.render(<StateObject1 />, document.getElementById('root'));

//Nested Routings
ReactDOM.render(<Routings />, document.getElementById('root'));

//Props Object
//ReactDOM.render(<Propsobject />, document.getElementById('root'));

//routing example 3
//ReactDOM.render(<Routings />, document.getElementById('root'));

//routing example 2
//ReactDOM.render(<Routings />, document.getElementById('root'));

//routing example 1 
//ReactDOM.render(<Routings />, document.getElementById('root'));


// react bootstrap
//ReactDOM.render(<Example1 />, document.getElementById('root'));
//external css
//ReactDOM.render(<External />,document.getElementById('root'));
//react css
//ReactDOM.render(<Inline />,document.getElementById('root'));

// 6. List Keys
//Object Type Array List Using Map
//ReactDOM.render(<ObjectTypeArrayListUsingMap />,document.getElementById('root'));
//ReactDOM.render(<ObjectTypeArrayListUsingMap2 />,document.getElementById('root'));
//ArrayList Using Map And IndexNumber
//ReactDOM.render(<ArrayListUsingMapAndIndexNumber />,document.getElementById('root'));
// Arraylist using map
//ReactDOM.render(<ArrayListUsingMap />,document.getElementById('root'));

//Function Binding
//ReactDOM.render(<FunctionBinding />,document.getElementById('root'));
//Object Binding
//ReactDOM.render(<ObjectBinding />,document.getElementById('root'));
//Array Binding
//ReactDOM.render(<ArrayBinding />,document.getElementById('root'));
//variable Binding
//ReactDOM.render(<VariableBinding />,document.getElementById('root'));
//Load External Json Data
//ReactDOM.render(<LoadExternalJsonData />,document.getElementById('root'));


//multiple components externally
//ReactDOM.render(<Home />,document.getElementById('root') );


//external component

//ReactDOM.render(<Home />,document.getElementById('root') );

/*
function Home()
{
    return(<React.Fragment>
                <h1>HELLO-REACT</h1>
                <h5>This is Exmaple of JSX with parent Element for Multiple Elements</h5>
                <p>
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                </p>
        </React.Fragment>);
}

ReactDOM.render(<Home />,document.getElementById('root') );
*/
//Functional_Component
/*
function Home()
{
    return(<React.Fragment>
                <h1>HELLO-REACT</h1>
                <h5>This is Exmaple of JSX with parent Element for Multiple Elements</h5>
                <p>
                    functional component with out using return 
                </p>
        </React.Fragment>);
}

ReactDOM.render(<Home />,document.getElementById('root') );
*/
//Calling Functional_Component_name by JSX Format
/*
<Home />
ReactDOM.render("caling fulction by jsx format",document.getElementById('root') );
*/
//functional component example 1
/*
function Home()
{
    return("HELLO INDIA");
}

ReactDOM.render(<Home />,document.getElementById('root') );
*/

//Functional_Component example 2
/*
function Home()
{
    return(<div>
                <h1>HELLO-REACT</h1>
                <h5>This is Exmaple of JSX with parent Element for Multiple Elements</h5>
                <p>
                    Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.
                </p>
        </div>);
}

ReactDOM.render(<Home />,document.getElementById('root') );
*/
//Calling Functional_Component_name by JSX Format

//<Home />


// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
