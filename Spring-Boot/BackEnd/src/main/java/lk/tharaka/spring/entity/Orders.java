package lk.tharaka.spring.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int oId;
    private Date date;
    private double tot;

    @ManyToOne
    private Customer customer;

    public Orders() {
    }

    public Orders(Date date, double tot, Customer customer) {
        this.date = date;
        this.tot = tot;
        this.customer = customer;
    }

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTot() {
        return tot;
    }

    public void setTot(double tot) {
        this.tot = tot;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oId=" + oId +
                ", date=" + date +
                ", tot=" + tot +
                ", customer=" + customer +
                '}';
    }
}
