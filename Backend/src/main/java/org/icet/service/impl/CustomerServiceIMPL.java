package org.icet.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.icet.repositary.NativeCustomerRepository;
import org.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    NativeCustomerRepository nativeCustomerRepository;
    @Override
    public String deleteCustomer(String name) {
         return nativeCustomerRepository.deleteCustomer(name);

    }
}
