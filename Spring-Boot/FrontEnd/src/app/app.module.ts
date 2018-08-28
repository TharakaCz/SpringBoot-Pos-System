import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { DashboardComponent } from './view/dashboard/dashboard.component';
import { MainComponent } from './view/main/main.component';
import { ManageCustomerComponent } from './view/manage-customer/manage-customer.component';
import { ManageItemsComponent } from './view/manage-items/manage-items.component';
import { ManageOrdersComponent } from './view/manage-orders/manage-orders.component';

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
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
