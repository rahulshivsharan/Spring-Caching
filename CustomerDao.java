/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojo.Customer;
import java.util.List;
/**
 *
 * @author rs69421
 */
public interface CustomerDao {   
    List<Customer> getCustomers() throws Exception;
}
