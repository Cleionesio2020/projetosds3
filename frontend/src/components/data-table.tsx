import axios from "axios";
import React, { useEffect, useState } from "react";
import { SalePage } from "types/sales";
import { formatLocalDate } from "utils/format";
import { BASE_URL } from "utils/requests";
import Pagination from "./pagination";

export default function DataTable() {

  const [activePage,setActivePage ]=useState(0);
  const [page, setPage] = useState<SalePage>({
    first: true,
    number: 0,
    totalElements: 0,
    totalPages: 0,
  });

  useEffect(() => {
    axios.get(`${BASE_URL}/sales?page=${activePage}&size=20&sort=date&,desc`)
    .then((response) => {
      const data = response.data as SalePage;
      setPage(data);
    });
  }, [activePage]);

  function changepage(index:number){
    setActivePage(index)
  }

  return (
    <>
    <Pagination page={page} onPageChange={changepage} />
    <div className="table-responsive">
      <table className="table table-striped table-sm">
        <thead>
          <tr>
            <th>Data</th>
            <th>Vendedor</th>
            <th>Clientes visitados</th>
            <th>Negócios fechados</th>
            <th>Valor</th>
          </tr>
        </thead>
        <tbody>
          {page.content?.map((item) => (
            <tr key={item.id}>
              <td>{formatLocalDate(item.date, "dd/MM/yyyy")}</td>
              <td>{item.seller.name} Allen</td>
              <td>{item.visited} </td>
              <td>{item.deals} </td>
              <td>{item.amount.toFixed(2)} </td>
            </tr>
          ))}
        </tbody>
      </table>
     
    </div>
    
    </>
  );
}
