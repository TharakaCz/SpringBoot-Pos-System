import { Component, OnInit } from '@angular/core';
import {Items} from "../../dto/items";
import {ItemsService} from "../../service/items.service";

@Component({
  selector: 'app-manage-items',
  templateUrl: './manage-items.component.html',
  styleUrls: ['./manage-items.component.css']
})


export class ManageItemsComponent implements OnInit {

  items:Array<Items>=[];

  constructor(private itemservice:ItemsService) { }

  ngOnInit() {
    this.loardAllItems();
  }

  loardAllItems():void{
    this.itemservice.getAllItems().subscribe(
      (result)=>{
        this.items = result;
      }
    )
  }
}
