package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.OrdersDataSevice;
import com.gcu.data.entity.OrderEntity;
import com.gcu.model.OrderModel;

public class OrdersBusinessService {

    @Autowired
    private OrdersDataSevice service;

    
    /**
     * Used to test the OrderBusinessService class
     */
    public void test() {
        System.out.println("Hello from the OrdersBusinessService");
    }

    
    /** 
     * Get's the orders from the order entity
     * 
     * @return List<OrderModel> returns a listed order model object
     */
    public List<OrderModel> getOrders() {
        // service.create(new OrderEntity("example", "example", 70.0f, 10));
        List<OrderEntity> ordersEntity = service.findAll();
        List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
        for (OrderEntity entity : ordersEntity) {
            ordersDomain.add(new OrderModel(entity.getId(), 
                                            entity.getOrderNo(), 
                                            entity.getProductName(), 
                                            entity.getPrice(), 
                                            entity.getQuantity()));
        }
        return ordersDomain;
    }

    /** 
     * Adds the order to OrderDataService
     * 
     * @param OrderEntity the order to be added
     */
    public boolean addOrder(OrderEntity order) {
        return service.create(order);
    }

    /** 
     * Initialize the OrderBusinessService
     */
    public void init() {
        System.out.println("Initializing OrdersBusinessService :)");
    }

    
    /** 
     * Destroy the OrderBusinessService
     */
    public void destroy() {
        System.out.println("Destroying OrdersBusinessService :(");
    }

    
    /** 
     * Used to check if the order exists already in the OrderDataService
     * 
     * @param long the id of the order
     */
    public boolean exists(long id) {
        return service.existsById(id);
    }

    
    /** 
     * Deletes the order from OrderDataService
     * 
     * @param long the id of the order
     */
    public void deleteOrder(long id) {
        service.deleteById(id);
    }
    
}
