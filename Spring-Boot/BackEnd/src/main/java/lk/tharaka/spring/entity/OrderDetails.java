package lk.tharaka.spring.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetails {

    private int qty;
    private double unitPrice;
    @ManyToOne
    @JoinColumn(name = "code",referencedColumnName = "code",insertable = false,updatable = false)
    private Item item;
    @ManyToOne
    @JoinColumn(name = "oId",referencedColumnName = "oId",insertable = false,updatable = false)
    private Orders orders;
    @EmbeddedId
    private OrderDetails_PK orderDetails_pk;

    public OrderDetails() {
    }

    public OrderDetails(int qty, double unitPrice, Item item, Orders orders, OrderDetails_PK orderDetails_pk) {
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.item = item;
        this.orders = orders;
        this.orderDetails_pk = orderDetails_pk;
    }


    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public OrderDetails_PK getOrderDetails_pk() {
        return orderDetails_pk;
    }

    public void setOrderDetails_pk(OrderDetails_PK orderDetails_pk) {
        this.orderDetails_pk = orderDetails_pk;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "qty=" + qty +
                ", unitPrice=" + unitPrice +
                ", item=" + item +
                ", orders=" + orders +
                ", orderDetails_pk=" + orderDetails_pk +
                '}';
    }
}
