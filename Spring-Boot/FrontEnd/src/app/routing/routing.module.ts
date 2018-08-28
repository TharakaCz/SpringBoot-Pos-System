import { NgModule } from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {MainComponent} from "../view/main/main.component";
import {ManageCustomerComponent} from "../view/manage-customer/manage-customer.component";
import {ManageItemsComponent} from "../view/manage-items/manage-items.component";
import {ManageOrdersComponent} from "../view/manage-orders/manage-orders.component";
import {DashboardComponent} from "../view/dashboard/dashboard.component";

const  appRoutes: Routes = [
  {

    path:"main" , component:MainComponent,

    children:[
      {path:"dashboard",component:DashboardComponent},
      {path:"manage-customer",component:ManageCustomerComponent},
      {path:"manage-items",component:ManageItemsComponent},
      {path:"manage-orders",component:ManageOrdersComponent},
      {path:"",pathMatch:"full",redirectTo:"/main/dashboard"}
    ]

  },
  {path:"",pathMatch:"full",redirectTo:"/main/dashboard"}
]

@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports: [
    RouterModule
  ]
})
export class RoutingModule { }
