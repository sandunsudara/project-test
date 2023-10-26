package org.icet.controller;

import lombok.extern.slf4j.Slf4j;
import org.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @DeleteMapping("/{name}")
    public String deleteCustomer(@PathVariable String name){
        return customerService.deleteCustomer(name);
    }

}
