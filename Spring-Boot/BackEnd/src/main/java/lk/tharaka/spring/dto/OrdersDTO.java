package lk.tharaka.spring.dto;

import java.util.Date;

public class OrdersDTO {

    private int oId;
    private Date date;
    private double tot;
    private CustomerDTO customerDTO;


    public OrdersDTO() {
    }

    public OrdersDTO(Date date, double tot, CustomerDTO customerDTO) {
        this.date = date;
        this.tot = tot;
        this.customerDTO = customerDTO;
    }

    public OrdersDTO(int oId, Date date, double tot, CustomerDTO customerDTO) {
        this.oId = oId;
        this.date = date;
        this.tot = tot;
        this.customerDTO = customerDTO;
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

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    @Override
    public String toString() {
        return "OrdersDTO{" +
                "oId=" + oId +
                ", date=" + date +
                ", tot=" + tot +
                ", customerDTO=" + customerDTO +
                '}';
    }
}
