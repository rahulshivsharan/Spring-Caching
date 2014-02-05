/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojo;

import java.io.Serializable;



public class Customer implements Serializable{
    
    public Customer(){}
    
    public Customer(Integer customerId,String name,String address){
        this.address = address;
        this.customerId = customerId;
        this.name = name;
    }
    
    private Integer customerId;
    private String name;
    private String address;

    /**
     * @return the customerId
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString(){
        StringBuffer str = new StringBuffer();
        str.append("\n\nID : ").append(this.customerId)
                .append("\nNAME : ").append(this.name)
                .append("\nADDRESS : ").append(this.address);
        return str.toString();
    }
    
}
