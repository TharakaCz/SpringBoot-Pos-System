import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Customer} from "../dto/customer";

export const MAIN_URL="http://localhost:8080";
const URL="/api/v1/customer";

@Injectable()
export class CustomerService {

  constructor(private http:HttpClient) { }


  getAllCustomer():Observable<Array<Customer>>{
    return this.http.get<Array<Customer>>(MAIN_URL+URL);
  }

}
