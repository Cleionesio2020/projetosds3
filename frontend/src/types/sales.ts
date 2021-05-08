import { type } from "node:os"


export type SaleSum = {
    saleName:string;
    sum:number;
}

export type SaleSuccsess = {
    saleName:string;
    visited:number;
    deals:number;
}

type Saller = {
    id:number;
    name:string
}

type Sale = {

    id: number,
    visited: number;
    deals: 31;
    amount:number;
    date: string
    seller: Saller
}


export type SalePage = {
    content?:Sale[];
    last?: boolean,
    totalPages: number,
    totalElements: number,
    numberOfElements?: number,
    size?: number,
    number: number,
    first: boolean,
    empty?: boolean

}