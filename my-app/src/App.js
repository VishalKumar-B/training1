import logo from './logo.svg';
import './App.css';
import ArrayListUsingMap from './ListKeys/ArrayLIstUsingMap';
import ArrayListUsingMapAndIndexNumber from './ListKeys/ArrayListUsingMapAndIndexNumber';
import LoadExternalJsonData from './ListKeys/LoadExternalJsonData';
import ObjectTypeArrayListUsingMap from './ListKeys/ObjectTypeArrayListUsingMap';
import ObjectTypeArrayListUsingMap2 from './ListKeys/ObjectTypeArrayListUsingMap2';
import ClassComponentInReact from './ReactClassComponent/ClassComponentInReact';

import Home from './ReactCss/Home';
import External from './ReactCss/External';

function App() {
  return (
    <div>
        <ArrayListUsingMap />
        <ArrayListUsingMapAndIndexNumber />
        <LoadExternalJsonData />
        <ObjectTypeArrayListUsingMap />
        <ObjectTypeArrayListUsingMap2 />

        <Home />
        <External />

        <ClassComponentInReact />
    </div>
  );
}

export default App;
