import { Component, OnInit } from '@angular/core';
import {Customer} from "../../dto/customer";
import {CustomerService} from "../../service/customer.service";

@Component({
  selector: 'app-manage-customer',
  templateUrl: './manage-customer.component.html',
  styleUrls: ['./manage-customer.component.css']
})
export class ManageCustomerComponent implements OnInit {

  customer:Array<Customer>=[];

  constructor(private customerService:CustomerService) { }

  ngOnInit() {
    this.loardAllCustomers();
  }

  loardAllCustomers():void{
    this.customerService.getAllCustomer().subscribe(
      (result)=>{
        this.customer = result;
      }
    )


  }

}
