package org.icet.repositary.impl;

import org.icet.repositary.NativeCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NativeCustomerRepositoryIMPL implements NativeCustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public String deleteCustomer(String name) {
        int update = jdbcTemplate.update("DELETE FROM customer WHERE customer_name=?", name);
        if(update > 0){
            return "Customer Deleted / custoemr_name : "+name;
        }
        else {
            return "something wrong..!";
        }
    }
}
