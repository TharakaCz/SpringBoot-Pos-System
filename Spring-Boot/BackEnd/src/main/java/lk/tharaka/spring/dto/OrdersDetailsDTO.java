package lk.tharaka.spring.dto;

public class OrdersDetailsDTO {

    private int qty;
    private double unitPrice;
    private ItemDTO itemDTO;
    private OrdersDTO ordersDTO;
    private OrderDetails_PKDTO orderDetails_pkdto;

    public OrdersDetailsDTO() {
    }

    public OrdersDetailsDTO(int qty, double unitPrice, ItemDTO itemDTO, OrdersDTO ordersDTO, OrderDetails_PKDTO orderDetails_pkdto) {
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.itemDTO = itemDTO;
        this.ordersDTO = ordersDTO;
        this.orderDetails_pkdto = orderDetails_pkdto;
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

    public ItemDTO getItemDTO() {
        return itemDTO;
    }

    public void setItemDTO(ItemDTO itemDTO) {
        this.itemDTO = itemDTO;
    }

    public OrdersDTO getOrdersDTO() {
        return ordersDTO;
    }

    public void setOrdersDTO(OrdersDTO ordersDTO) {
        this.ordersDTO = ordersDTO;
    }

    public OrderDetails_PKDTO getOrderDetails_pkdto() {
        return orderDetails_pkdto;
    }

    public void setOrderDetails_pkdto(OrderDetails_PKDTO orderDetails_pkdto) {
        this.orderDetails_pkdto = orderDetails_pkdto;
    }

    @Override
    public String toString() {
        return "OrdersDetailsDTO{" +
                "qty=" + qty +
                ", unitPrice=" + unitPrice +
                ", itemDTO=" + itemDTO +
                ", ordersDTO=" + ordersDTO +
                ", orderDetails_pkdto=" + orderDetails_pkdto +
                '}';
    }
}
