package lk.tharaka.spring.dto;

public class OrderDetails_PKDTO {

    private int code;

    private int oId;

    public OrderDetails_PKDTO(int code, int oId) {
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
        return "OrderDetails_PKDTO{" +
                "code=" + code +
                ", oId=" + oId +
                '}';
    }
}
