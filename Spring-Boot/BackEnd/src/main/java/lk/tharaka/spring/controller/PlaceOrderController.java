package lk.tharaka.spring.controller;

import lk.tharaka.spring.dto.PlaceOrderDTO;
import lk.tharaka.spring.service.PlaceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/orders")
public class PlaceOrderController {

    @Autowired
    private PlaceOrderService service;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean save(@RequestBody PlaceOrderDTO placeOrderDTO){
        return service.save(placeOrderDTO);
    }
}
