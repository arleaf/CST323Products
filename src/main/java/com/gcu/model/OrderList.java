package com.gcu.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="orders")
public class OrderList {
    private List<OrderModel> orders = new ArrayList<OrderModel>();

    
    /** 
     * returns all orders
     * 
     * @return List<OrderModel>
     */
    @XmlElement(name="order")
    public List<OrderModel> getOrders() {
        return this.orders;
    }
    
    
    /** 
     * set all orders
     * 
     * @param List<OrderModel> Set orders within the list
     */
    public void setOrders(List<OrderModel> orders) {
        this.orders = orders;
    }
}
