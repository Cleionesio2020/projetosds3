import axios from "axios";
import { useEffect, useState } from "react";
import Chart from 'react-apexcharts'
import { SaleSum } from "types/sales";
import { BASE_URL } from "utils/requests"

type ChartData = {
  label:string[];
  series:number[];
}

export default function DonutChart() {

  const[ chartData , setChartData ] = useState<ChartData>({ label:[], series:[] })

  useEffect(()=>{
    axios.get(`${BASE_URL}/sales/amount-by-sales`).then((response)=>{
      const data = response.data as SaleSum[];
      const myLabels = data.map(x=> x.saleName); 
      const mySeries = data.map(x=> x.sum)
      setChartData({label:myLabels,series:mySeries})
      console.log(chartData)
    })
  },[])
  
  

  //const mockData = {
    //series: [477138, 499928, 444867, 220426, 473088],
    //labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
  //}

const options = {
    legend: {
        show: true
    }
}
  return (
    <Chart
      options={{ ...options, labels: chartData.label}}
      series={ chartData.series }
      type="donut"
      height="240"
      width="450"
    />
  );
}
