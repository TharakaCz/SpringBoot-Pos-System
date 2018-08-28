package lk.tharaka.spring.service.impl;

import lk.tharaka.spring.dto.CustomerDTO;
import lk.tharaka.spring.entity.Customer;
import lk.tharaka.spring.repository.CustomerRepository;
import lk.tharaka.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public boolean save(CustomerDTO customerDTO) {

        Customer customer = new Customer(
                customerDTO.getName(),
                customerDTO.getAddress(),
                customerDTO.getContact());


            repository.save(customer);
            return true;
        }

    @Override
    public boolean delete(int id) {
        repository.deleteById(id);
        return true;
    }


    @Override
    public CustomerDTO getCustomer(int id) {
        Customer customer = repository.findById(id).get();

        CustomerDTO customerDTO = new CustomerDTO(customer.getId(),
                customer.getName(),
                customer.getAddress(),
                customer.getContact());

        return customerDTO;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() {

        List<Customer>customers=repository.findAll();

        ArrayList<CustomerDTO>customerDTOList = new ArrayList<>();

        for (Customer customer : customers){
            CustomerDTO customerDTO = new CustomerDTO(customer.getId(),
                    customer.getName(),
                    customer.getAddress(),
                    customer.getContact()
            );

            customerDTOList.add(customerDTO);
        }
        return customerDTOList;
    }


}
