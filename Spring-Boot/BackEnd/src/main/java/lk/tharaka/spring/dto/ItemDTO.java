package lk.tharaka.spring.dto;

public class ItemDTO {

    private int code;
    private String iName;
    private String iDiscription;
    private int qty;
    private double unitPrice;

    public ItemDTO() {
    }

    public ItemDTO(int code, String iName, String iDiscription, int qty, double unitPrice) {
        this.code = code;
        this.iName = iName;
        this.iDiscription = iDiscription;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public ItemDTO(String iName, String iDiscription, int qty, double unitPrice) {
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
        return "ItemDTO{" +
                "code=" + code +
                ", iName='" + iName + '\'' +
                ", iDiscription='" + iDiscription + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
