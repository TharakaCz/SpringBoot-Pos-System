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
}
