import * as React from "react";
import { Routes, Route } from "react-router-dom";
import Home from "./views/Home/Home";
import "./App.css";
import Header from "./components/header/header";
function App() {
  return (
    <div className="App">     
      <Header />
      <Routes>
        <Route path="/" element={<Home />} />
      </Routes>
    </div>
  );
}

export default App;
