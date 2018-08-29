import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {PlaceOrder} from "../dto/place-order";
import {Observable} from "rxjs";

export const MAIN_URL="http://localhost:8080";
const URL="/api/v1/orders";

@Injectable()
export class PlaceOrderService {

  constructor(private http:HttpClient) { }

  save(placeorder:PlaceOrder):Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL+URL,placeorder);
  }
}
