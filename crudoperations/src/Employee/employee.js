import { Component } from "react";
// import Modal from "react-modal";
//import ReactDOM from 'react-dom';
// import { FormGroup, FormControl, ControlLabel, Form } from "react-bootstrap";
import Modal from './Empmodal.js';


import empdata from './employeedata.json';

class Employee extends Component {

constructor(props){
    super(props);
    this.state = {
        
        act: 0,
        index: '',
        datas: [] = empdata,
        search: ''
        
    };

}

    // openModalHandler = () => {
    //     this.setState({
    //         isShowing: true
    //     });
    // }

    // closeModalHandler = () => {
    //     this.setState({
    //         isShowing: false
    //     });
    // }
updateSearch(event) {
    this.setState({search: event.target.value.substr(0,20)});
}

// componentDidMount(){
//     this.refs.id.focus();
//  }

fsubmit = (e) => {
    e.preventDefault();
    console.log('try');

    let datas = this.state.datas;
    let id = this.refs.id.value;
    let name = this.refs.name.value;
    let email = this.refs.email.value;
    let phone = this.refs.phone.value;

    if(this.state.act === 0) {
        let data = {
        id,name,email,phone
        }
    datas.push(data);
    } 
    else {
        let index = this.state.index;
        datas[index].id = id;
        datas[index].name = name;
        datas[index].email = email;
        datas[index].phone = phone;
    }

    this.setState({
        datas: datas,   
        act: 0
    });

    this.refs.myform.reset();
    // this.refs.name.focus();
}

fRemove = (i) => {
    let datas = this.state.datas;
    datas.splice(i,1);
    this.setState({
        datas:datas
    });
    
    this.refs.myform.reset();
    //this.refs.name.focus();
} 

fEdit = (i) => {
    let data = this.state.datas[i];

    this.refs.id.value = data.id;
    this.refs.name.value = data.name;
    this.refs.email.value = data.email;
    this.refs.phone.value = data.phone;

    this.setState({
        act:1,
        index: i
    });

    //this.refs.id.focus();
}


render() {
    let fdatas = this.state.datas.filter(
        (d) => {
            return (d.name.toLowerCase().indexOf(this.state.search.toLowerCase()) && d.email.toLowerCase().indexOf(this.state.search.toLowerCase())) !== -1;
        }
    );
    return(
    <div>
    <h1>In employee component</h1>
    
    {/* <div>
                { this.state.isShowing ? <div onClick={this.closeModalHandler} className="back-drop"></div> : null }

                <button className="btn btn-primary" onClick={this.openModalHandler}>add employee</button>

                <Modal
                    show={this.state.isShowing}
                    close={this.closeModalHandler}>
                        Maybe aircrafts fly very high because they don't want to be seen in plane sight?
                </Modal>
    </div> */}

    {/* <div className = "container mt-5">
        <button className="btn btn-primary">add employee</button>
        <Modal isOpen={false}>
            <h1> in model </h1>
        </Modal>
    </div> */}
    
    
    <div className="container mt-5">
    <form ref="myform">
        <div className="form-group">
            <label>ID</label>
            <input type="number" className="form-control" ref="id" />
        </div>
        <div className="form-group">
            <label>Name</label>
            <input type="text" className="form-control" ref="name" />
        </div>
        <div className="form-group">
            <label>Email</label>
            <input type="text" ref="email" className="form-control" />
        </div>
        <div className="form-group">
            <label>Phone</label>
            <input type="number" ref="phone" className="form-control" />
        </div>
        <div className="form-group">
        <button onClick={this.fsubmit} className="btn btn-primary">submit</button>
        </div>
    </form>
    </div>
    
    <div className="container mt-5">
    <h3 className="mt-2 mb-4">List Of Employees</h3>
    <input type="text" className="form-control" value={this.state.search} onChange={this.updateSearch.bind(this)} placeholder="Search Employee ..." />
    <table className="table">
    <caption>List Of Employees</caption>
        <thead>
            <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th></th>
            <th></th>
            </tr>
        </thead>
        <tbody>
        {
        fdatas.map((data,i) => 
            <tr key={i}> 
                <td>{data.id}</td>
                <td>{data.name}</td>
                <td>{data.email}</td>
                <td>{data.phone}</td>
                <td><button onClick={()=>this.fRemove(i)} className="btn btn-primary">Delete</button></td>
                <td><button onClick={()=>this.fEdit(i)} className="btn btn-primary">Update</button></td>
            </tr>)
        }       
        </tbody>
    </table>
    </div>

    </div>
    );
}
}
export default Employee;

//  -1, 0, and 1 in a comparison function are used to tell the caller 
//  how the first value should be sorted in relation to the second one. 
//  -1 means the first goes before the second, 1 means it goes after, and 0 means they're equivalent.