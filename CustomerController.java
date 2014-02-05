/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.pojo.Customer;
import com.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    @Qualifier("customerService")
    private CustomerService service;
    
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public @ResponseBody List<Customer> getCustomerList(){
        List<Customer> list = null;
        try{
            list = service.getCustomer();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return list;
    }

    /**
     * @return the service
     */
    public CustomerService getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(CustomerService service) {
        this.service = service;
    }
}
