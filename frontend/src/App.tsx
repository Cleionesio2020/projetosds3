import React from "react";

import BarChart from "components/BarChart";
import DanutChart from "components/DonutChart";
import DataTable from "components/data-table";
import Footer from "components/footer";
import Header from "components/header";

function App() {
  return (
    <>
      <Header />
      <div className="container">
        <h1 className="text-primary">Dashboard Dev Superior</h1>
        <div className="row" py-3>
          <div>
              <h5 className="text-secondary text-center">Taxa de sucesso</h5>
            <BarChart />
          </div>

          <div>
          <h5 className="text-secondary text-center">Todas as Vendas</h5>
          <DanutChart/>
          </div>
        </div>

        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
