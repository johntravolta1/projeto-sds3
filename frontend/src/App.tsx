import Datatable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/NavBar";
import React from "react";

function App() {
  return (
    <>
      <NavBar></NavBar>
      <div className="container">
        <h1 className="text-primary">Hello world!</h1>
      </div>
      <Datatable></Datatable>
      <Footer></Footer>

    </>
  );
}

export default App;
