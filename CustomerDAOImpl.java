/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojo.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rs69421
 */

@Repository("customerDao")
public class CustomerDAOImpl  implements CustomerDao{

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    
    @Override
    @Cacheable("cache_one")
    public List<Customer> getCustomers() throws Exception {
        List<Customer> customerList =  jdbcTemplate.query("select customerId,customername from customer order by customerId", new RowMapper<Customer>(){

            @Override
            public Customer mapRow(ResultSet rs, int i) throws SQLException {
                Customer customer = new Customer();
                customer.setName(rs.getString("customername"));
                customer.setCustomerId(rs.getInt("customerId"));
                System.out.println(customer);
                return customer;
            }
            
        });
        return customerList;
    }

    /**
     * @return the jdbcTemplate
     */
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    /**
     * @param jdbcTemplate the jdbcTemplate to set
     */
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
}
