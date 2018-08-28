import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { DashboardComponent } from './view/dashboard/dashboard.component';
import { MainComponent } from './view/main/main.component';
import { ManageCustomerComponent } from './view/manage-customer/manage-customer.component';
import { ManageItemsComponent } from './view/manage-items/manage-items.component';
import { ManageOrdersComponent } from './view/manage-orders/manage-orders.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import {ItemsService} from "./service/items.service";
import {RoutingModule} from "./routing/routing.module";
import {AlertModule} from "ngx-alerts";
import {CustomerService} from "./service/customer.service";

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    MainComponent,
    ManageCustomerComponent,
    ManageItemsComponent,
    ManageOrdersComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AlertModule.forRoot({maxMessages:5,timeout:5000}),
    RoutingModule
  ],
  providers: [
    ItemsService,
    CustomerService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
