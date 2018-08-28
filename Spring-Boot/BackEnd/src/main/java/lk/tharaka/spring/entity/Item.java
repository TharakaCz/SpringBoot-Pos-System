package lk.tharaka.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int code;
    private String iName;
    private String iDiscription;
    private int qty;
    private double unitPrice;


    public Item() {
    }

    public Item(String iName, String iDiscription, int qty, double unitPrice) {
        this.iName = iName;
        this.iDiscription = iDiscription;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public String getiDiscription() {
        return iDiscription;
    }

    public void setiDiscription(String iDiscription) {
        this.iDiscription = iDiscription;
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

    @Override
    public String toString() {
        return "Item{" +
                "code=" + code +
                ", iName='" + iName + '\'' +
                ", iDiscription='" + iDiscription + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
