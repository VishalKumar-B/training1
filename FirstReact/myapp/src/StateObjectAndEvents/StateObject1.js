import React,{  setState } from 'react'

//child CLASSES
class StateObject1 extends  React.Component 
{

  constructor() 
  {
    super();

    //Step-1: Create state object and Initialization also
    this.state={
                  id:1,
                  name:'kumar',
                  email:'kumar@gmail.com'
               }
  }


  //Custom_class_Functions for StateHandlings
  handleStateData=()=>
  {
    this.setState({   
                    id:101, 
                    name:'vishalkumar', 
                    email:"abc@gmail.com" 
                  })
  }




  render() 
  {
      return(<>  

               <div class="container py-5">
                    <h3 className="text-center py-3">CLASS COMPONENT with STATE OBJECT</h3>

                    {/* <p> U_ID is: { this.state.id } </p>

                    <p>U_NAME is: { this.state.name } </p>

                    <p>U_EMAIL is: { this.state.email } </p> */}

                    <br /> <br />


                    <form>
                    <center>
                    <table>
                    <tr>
                    <td><label>User ID: </label></td>
                    <td><input type="number" value={this.state.id} /></td> <br />
                    </tr>
                    <tr>
                    <td><label>User NAME: </label></td>
                    <td><input type="text" value={this.state.name} /></td>  <br />
                    </tr>
                    <tr>
                    <td><label>User EMAIL: </label></td>
                    <td><input type="email" value={this.state.email} /></td>  <br />
                    </tr>
                    <tr>
                    
                    <td colspan='2'><button type="button"
                          className="btn btn-info" 
                          onClick={  this.handleStateData }> 
                          Change Multiple_Properties 
                    </button></td>
                    </tr>
                    </table>

                    </center>
                    </form>


                    


               </div>
            </>)
  }

}

export default StateObject1