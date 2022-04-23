import { Route, Routes } from "react-router-dom";
import { About, Books, Home } from "./pages";
import "./App.css";

function App() {
  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="about" element={<About />} />
      <Route path="books" element={<Books />} />
    </Routes>
  );
}

export default App;
