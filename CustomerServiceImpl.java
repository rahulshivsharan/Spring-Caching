/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.dao.CustomerDao;
import com.pojo.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author rs69421
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    @Qualifier("customerDao")
    private CustomerDao dao;

    @Override
    public List<Customer> getCustomer() throws Exception{
        List<Customer> list = null;

        list = getDao().getCustomers();

        return list;
    }

    /**
     * @return the dao
     */
    public CustomerDao getDao() {
        return dao;
    }

    /**
     * @param dao the dao to set
     */
    public void setDao(CustomerDao dao) {
        this.dao = dao;
    }
}
