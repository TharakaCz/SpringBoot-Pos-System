package lk.tharaka.spring.controller;


import lk.tharaka.spring.dto.CustomerDTO;
import lk.tharaka.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/customer")

public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean save(@RequestBody CustomerDTO customerDTO){
        return service.save(customerDTO);

    }

    @DeleteMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean delete(@PathVariable("id") int id){
        return service.delete(id);
    }


    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getCustomer(@PathVariable("id") int id){
        return service.getCustomer(id);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDTO>getAllCustomer(){
        return service.getAllCustomer();
    }
}
