package lk.tharaka.spring.service;

import lk.tharaka.spring.dto.CustomerDTO;

import java.util.ArrayList;


public interface CustomerService {

    public boolean save(CustomerDTO customerDTO);

    public boolean delete(int id);

//    public boolean update (CustomerDTO customerDTO);

    public CustomerDTO getCustomer(int id);

    public ArrayList<CustomerDTO> getAllCustomer();

}
