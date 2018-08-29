import {Items} from "./items";
import {Orders} from "./orders";
import {OrderDetailsPK} from "./order-details-pk";

export class OrderDelails {

  qty:number;
  unitPrice:any;
  itemDTO:Items;
  ordersDTO:Orders;
  orderDetails_pkdto:OrderDetailsPK;

}
