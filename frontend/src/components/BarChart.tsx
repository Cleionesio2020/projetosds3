import axios from "axios";
import React, { useEffect, useState } from "react";
import Chart from "react-apexcharts";
import { SaleSuccsess } from "types/sales";
import { round } from "utils/format";
import { BASE_URL } from "utils/requests";

type SeriesData = {
  name: string;
  data: number[];
};

type Chartdata = {
  labels: { categories: string[] };

  series: SeriesData[];
};

export default function BarChart() {
  const [chartData, setChartData] = useState<Chartdata>({
    labels: {
      categories: [],
    },
    series: [
      {
        name: "",
        data: [],
      },
    ],
  });

  useEffect(() => {
    axios.get(`${BASE_URL}/sales/success-by-sales`).then((response)=>{
      const data = response.data as SaleSuccsess[];
      const myLabels = data.map( x => x.saleName)
      const maySeries = data.map(x => round( 100.0 * x.deals/x.visited,1))
      setChartData(
        {
          labels: {
            categories: myLabels
          },
          series: [
            {
              name: "% Success",
              data: maySeries,
            },
          ],
        }
      )
    })

  }, []);

  const options = {
    plotOptions: {
      bar: {
        horizontal: true,
      },
    },
  };

  
  return (
    <Chart
      options={{ ...options, xaxis: chartData.labels}}
      series={chartData.series}
      type="bar"
      height="240"
      width="450"
    />
  );
}
