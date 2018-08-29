import {Component, OnInit, ViewChild} from '@angular/core';
import {Items} from "../../dto/items";
import {ItemsService} from "../../service/items.service";
import {AlertService} from "ngx-alerts";
import {NgForm} from "@angular/forms";

@Component({
  selector: 'app-manage-items',
  templateUrl: './manage-items.component.html',
  styleUrls: ['./manage-items.component.css']
})


export class ManageItemsComponent implements OnInit {

  items:Array<Items>=[];
  choosedItems:Items = new Items();
  @ViewChild("frmItems") frmItems:NgForm;

  constructor(private itemservice:ItemsService,private alertService:AlertService) { }

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

  saveItems():void{
    this.itemservice.save(this.choosedItems).subscribe(
      (result)=>{
        if (result){
          this.alertService.success("Item Saved SuccsessFully");
          this.loardAllItems();
        } else {
          this.alertService.warning("Item Saved Faild");
        }
      }
    )
  }

  deleteItems(items:Items):void{
    if (confirm("You Want To Delete This Item")){
      this.itemservice.delete(items.code).subscribe(
        (result)=>{
          if (result){
            this.alertService.danger("Item Delete Succsessfully");
          } else {
            this.alertService.warning("Item Delete Faild");

          }
        }
      )
    }

  }
}
