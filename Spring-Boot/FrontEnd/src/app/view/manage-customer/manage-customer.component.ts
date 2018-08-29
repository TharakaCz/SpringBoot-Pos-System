import {Component, OnInit, ViewChild} from '@angular/core';
import {Customer} from "../../dto/customer";
import {CustomerService} from "../../service/customer.service";
import {AlertService} from "ngx-alerts";
import {NgForm} from "@angular/forms";

@Component({
  selector: 'app-manage-customer',
  templateUrl: './manage-customer.component.html',
  styleUrls: ['./manage-customer.component.css']
})
export class ManageCustomerComponent implements OnInit {

  customer:Array<Customer>=[];
  choosedCustomer:Customer = new Customer();
  @ViewChild("frmCustomers") frmCustomers:NgForm;

  constructor(private customerService:CustomerService,private alertService:AlertService) { }

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


  saveCustomer():void{
    this.customerService.save(this.choosedCustomer).subscribe(
      (result)=>{
        if (result){
          this.alertService.success("Customer Saved Succsessfully");
          this.loardAllCustomers();
        } else {
          this.alertService.danger("Customer Saved Faild");
        }
      }
    )
  }

  deleteCustomer(customer:Customer):void{
    this.customerService.delete(customer.id).subscribe(
      (result)=>{
        if (result){
          this.alertService.danger("Customer Deleted Succsessfuly");
          this.loardAllCustomers();
        } else {
          this.alertService.warning("Customer Deleted Faild");
        }
      }
    )
  }

}
