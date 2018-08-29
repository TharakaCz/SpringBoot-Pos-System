import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {OrdersService} from "../../service/orders.service";
import {AlertService} from "ngx-alerts";
import {Customer} from "../../dto/customer";
import {OrderDelails} from "../../dto/order-delails";
import {Items} from "../../dto/items";
import {OrderDetailsPK} from "../../dto/order-details-pk";
import {PlaceOrder} from "../../dto/place-order";
import {Orders} from "../../dto/orders";
import {NgForm} from "@angular/forms";
import {THIS_EXPR} from "@angular/compiler/src/output/output_ast";
import {CustomerService} from "../../service/customer.service";
import {ItemsService} from "../../service/items.service";
import {PlaceOrderService} from "../../service/place-order.service";

@Component({
  selector: 'app-manage-orders',
  templateUrl: './manage-orders.component.html',
  styleUrls: ['./manage-orders.component.css']
})
export class ManageOrdersComponent implements OnInit {

  customers: Array<Customer> = [];
  item: Array<Items> = [];
  selectedItems: Array<OrderDelails> = [];
  FullTotal: number = 0;
  serchedItems: Items = new Items();
  serchedCustomers: Customer = new Customer();
  orderDetail_PKDTO: OrderDetailsPK;
  orderDetals: OrderDelails;
  items: any = [];
  placeOrder: PlaceOrder;
  orders: Orders;
  Total: number = 0;

  @ViewChild("frmItems") frmItems: NgForm;

  constructor(private ordersService: OrdersService, private alertService: AlertService, private customerService: CustomerService,
              private itemService: ItemsService,private elem:ElementRef,private placeOrderService:PlaceOrderService) {
  }

  ngOnInit() {

    this.getCustomerID();
    this.getItemID();
  }

  getCustomerID(): void {
    this.customerService.getAllCustomer().subscribe(
      (result) => {
        this.customers = result;
      }
    )
  }

  getItemID(): void {
    this.itemService.getAllItems().subscribe(
      (result) => {
        this.item = result;
      }
    )
  }

  getItem(event:any):void{
    this.itemService.getItem(event.target.value).subscribe(
      (result)=>{
        this.serchedItems = result;
      }
    )
  }

  selectOrderDetails():void{

    let orderDate = this.elem.nativeElement.querySelector('#orderDate').value;
    let qty = this.elem.nativeElement.querySelector('#qty').value;


    this.Total=qty*this.serchedItems.unitPrice;
    this.FullTotal=this.FullTotal+this.Total;
    var price=this.FullTotal;

    this.orders=new Orders(orderDate,this.Total,this.serchedCustomers)
    console.log(this.orders.tot);
    this.orderDetail_PKDTO=new OrderDetailsPK();
    this.orderDetals=new OrderDelails();
    this.orderDetals.qty=qty;
    this.orderDetals.unitPrice=this.serchedItems.unitPrice;
    this.orderDetals.itemDTO=this.serchedItems;
    this.orderDetals.ordersDTO=this.orders;
    this.orderDetals.orderDetails_pkdto=this.orderDetail_PKDTO;


    this.selectedItems.push(this.orderDetals);
  }

  searchCustomer(event:any):void{
    this.customerService.getCustomer(event.target.value).subscribe(
      (result)=>{
        this.serchedCustomers = result;
      }
    )
  }

  addOrder():void{
    this.placeOrder = new PlaceOrder();
    this.placeOrder.itemDTO=this.serchedItems;
    this.placeOrder.ordersDTO=this.orders;
    this.placeOrder.ordersDetailsDTOS=this.selectedItems;

    this.placeOrderService.save(this.placeOrder).subscribe(
      (result)=>{
        if (result){
          this.alertService.success("Order Placed Succsessfully");
        } else {
          this.alertService.warning("Order Placed Faild")
        }
      }
    )
  }


}
