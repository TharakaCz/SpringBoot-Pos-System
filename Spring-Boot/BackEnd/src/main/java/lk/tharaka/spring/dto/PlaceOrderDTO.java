package lk.tharaka.spring.dto;

import java.util.List;

public class PlaceOrderDTO {

    private ItemDTO itemDTO;
    private OrdersDTO ordersDTO;
    private List<OrdersDetailsDTO>ordersDetailsDTOS;

    public PlaceOrderDTO() {
    }

    public PlaceOrderDTO(ItemDTO itemDTO, OrdersDTO ordersDTO, List<OrdersDetailsDTO> ordersDetailsDTOS) {
        this.itemDTO = itemDTO;
        this.ordersDTO = ordersDTO;
        this.ordersDetailsDTOS = ordersDetailsDTOS;
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

    public List<OrdersDetailsDTO> getOrdersDetailsDTOS() {
        return ordersDetailsDTOS;
    }

    public void setOrdersDetailsDTOS(List<OrdersDetailsDTO> ordersDetailsDTOS) {
        this.ordersDetailsDTOS = ordersDetailsDTOS;
    }

    @Override
    public String toString() {
        return "PlaceOrderDTO{" +
                "itemDTO=" + itemDTO +
                ", ordersDTO=" + ordersDTO +
                ", ordersDetailsDTOS=" + ordersDetailsDTOS +
                '}';
    }
}
