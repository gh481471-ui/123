App.js
import { BrowserRouter, Routes, Route, Link } from "react-router-dom";

import Fashion from "./pages/Fashion";
import Mobiles from "./pages/Mobiles";
import Deals from "./pages/Deals";

function App() {
  return (
    <BrowserRouter>a
      <nav>
        <Link to="/mobiles">Mobiles</Link>
        <Link to="/fashion">Fashion</Link>
        <Link to="/deals">Deals</Link>
      </nav> nb       

      <Routes>
        <Route path="/fashion" element={<Fashion />} />
        <Route path="/mobiles" element={<Mobiles />} />
        <Route path="/deals" element={<Deals />} />
      </Routes>

    </BrowserRouter>
  );
}


Deals...
function Deals() {
  return (
    <h1>Welcome to Deals</h1>
  );
}
export default Deals;


Fashion...\
function Fashion() {
  return (
    <h1>Welcome to Fashion</h1>
  );
}

export default Fashion;


Mobiles.../
function Mobiles() {
  return (
    <h1>Welcome to Mobile</h1>
  );
}

export default Mobiles;




export default App;