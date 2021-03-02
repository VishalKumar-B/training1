import users from '../ListKeys/userdata.json';
import './Style.css';

const External=()=> {    

const finalresult=users.map( (result,index)=>{        
     return(
    
     <ul key={index}>
                <li> {result.id} </li>
                <li> {result.name} </li>
                <li> {result.email} </li>
                <li> {result.phno} </li>
    </ul>
   
    )
})

const boot = users.map( (result,index)=>{        
     return(
         <ul className="list-group list-group-flush" key={index}>
            <li className="list-group-item">{result.id}</li>
            <li className="list-group-item">{result.name}</li>
            <li className="list-group-item">{result.email}</li>
            <li className="list-group-item">{result.phno}</li>
        </ul>
     )})

    return(<>
                <h1 className="h1">External Css</h1>
                <p  className="p">
                    hi react 
                </p>

                { finalresult }

                <h1 className="h1">Using Boot Strap</h1>
                { boot }

        </>);
}

export default External
