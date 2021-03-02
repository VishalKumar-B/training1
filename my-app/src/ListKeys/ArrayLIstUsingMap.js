//Services Component...Externally

import React from 'react';

//Services Component
const ArrayListUsingMap=()=> {    

var employees = [
    {
        id: 1,
        name: 'vishal',
        email: 'vishal@gmail.com',
    },
    {
        id: 2,
        name: 'a',
        email: 'a@gmail.com',
    },
    {
        id: 3,
        name: 'b',
        email: 'b@gmail.com',
    }
]

var list = employees.map((emp)=>{
    return(
        <ul key = {emp.id}>
            <li>{emp.id}</li>
            <li>{emp.name}</li>
            <li>{emp.email}</li>
        </ul>
    )
}
) 
return (<>
<div>
<h1>Array List Using Map</h1>
    {list}
</div>
</>);
}
export default ArrayListUsingMap

//if you don't add key it will throw an error in dom 
//error: index.js:1 Warning: Each child in a list should have a unique "key" prop
//react is telling us that hey each item rendered using map() should have a prop called key
//value to that prop should be unique in the list
// in the above example we are giving id as an key because it is unique 

//if two keys have the same value you will get below error
//Encountered two children with the same key, `1`. Keys should be unique so that components maintain 
//their identity across updates. 
//Non-unique keys may cause children to be duplicated and/or omitted — 
//the behavior is unsupported and could change in a future version.

