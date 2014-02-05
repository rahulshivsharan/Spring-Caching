/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.pojo.Customer;
import java.util.List;

/**
 *
 * @author rs69421
 */
public interface CustomerService {
    
    List<Customer> getCustomer() throws Exception;
}
