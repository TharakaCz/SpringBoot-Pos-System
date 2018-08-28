package lk.tharaka.spring.service.impl;

import lk.tharaka.spring.dto.*;
import lk.tharaka.spring.entity.*;
import lk.tharaka.spring.repository.OrderDetailsRepository;
import lk.tharaka.spring.repository.OrdersRepository;
import lk.tharaka.spring.service.PlaceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class PlaceOrderServiceImpl implements PlaceOrderService {

    @Autowired
    private OrdersRepository repository;

    @Autowired
    private OrderDetailsRepository detailsRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean save(PlaceOrderDTO placeOrderDTO) {

        OrdersDTO ordersDTO = placeOrderDTO.getOrdersDTO();
        CustomerDTO customerDTO=placeOrderDTO.getOrdersDTO().getCustomerDTO();

        Customer customer = new Customer();
        customer.setName(customerDTO.getName());
        customer.setAddress(customerDTO.getAddress());
        customer.setContact(customerDTO.getContact());

        Orders orders = new Orders();
        orders.setCustomer(customer);
        orders.setDate(ordersDTO.getDate());
        orders.setTot(placeOrderDTO.getItemDTO().getUnitPrice());

        repository.save(orders);


        List<OrdersDetailsDTO>ordersDetailsDTOS=placeOrderDTO.getOrdersDetailsDTOS();

        for (OrdersDetailsDTO ordersDetailsDTO : ordersDetailsDTOS){

            ItemDTO itemDTO = placeOrderDTO.getItemDTO();
            Item item = new Item();
            item.setCode(itemDTO.getCode());
            item.setiName(item.getiName());
            item.setiDiscription(itemDTO.getiDiscription());
            item.setQty(itemDTO.getQty());
            item.setUnitPrice(itemDTO.getUnitPrice());

            OrderDetails_PK orderDetails_pk = new OrderDetails_PK();
            orderDetails_pk.setCode(itemDTO.getCode());
            orderDetails_pk.setoId(ordersDTO.getoId());

            OrderDetails orderDetails = new OrderDetails();
            orderDetails.setQty(ordersDetailsDTO.getQty());
            orderDetails.setUnitPrice(ordersDetailsDTO.getUnitPrice());
            orderDetails.setItem(item);
            orderDetails.setOrders(orders);
            orderDetails.setOrderDetails_pk(orderDetails_pk);

            detailsRepository.save(orderDetails);

        }
        return true;
    }
}
