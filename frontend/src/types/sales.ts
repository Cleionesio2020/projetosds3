import { type } from "node:os";

export type SaleSum = {
    saleName:string;
    sum:number;
}

export type SaleSuccsess = {
    saleName:string;
    visited:number;
    deals:number;
}