package lk.tharaka.spring.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderDetails_PK implements Serializable {

    private int code;

    private int oId;

    public OrderDetails_PK() {
    }

    public OrderDetails_PK(int code, int oId) {
        this.code = code;
        this.oId = oId;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    @Override
    public String toString() {
        return "OrderDetails_PK{" +
                "code=" + code +
                ", oId=" + oId +
                '}';
    }
}
