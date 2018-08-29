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

  save(cucstomer:Customer):Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL+URL,cucstomer);
  }

  delete(code:number):Observable<boolean>{
    return this.http.delete<boolean>(MAIN_URL+URL+"/"+code);
  }

  getCustomer(code:number):Observable<Customer>{
    return this.http.get<Customer>(MAIN_URL+URL+"/"+code);
  }
}
