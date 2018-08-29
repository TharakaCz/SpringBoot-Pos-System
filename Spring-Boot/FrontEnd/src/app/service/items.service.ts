import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Items} from "../dto/items";


export const MAIN_URL="http://localhost:8080";
const URL="/api/v1/items";

@Injectable()
export class ItemsService {

  constructor(private http:HttpClient) { }


  getAllItems():Observable<Array<Items>>{
    return this.http.get<Array<Items>>(MAIN_URL+URL);
  }

  save(items:Items):Observable<boolean>{
    return this.http.post<boolean>(MAIN_URL+URL,items);
  }

  delete(id:number):Observable<boolean>{
    return this.http.delete<boolean>(MAIN_URL+URL+"/"+id);
  }

  getItem(id:number):Observable<Items>{
    return this.http.get<Items>(MAIN_URL+URL+"/"+id);
  }
}
