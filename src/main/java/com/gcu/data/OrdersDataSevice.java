package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.entity.OrderEntity;
import com.gcu.data.repository.OrdersRepository;

@Service
public class OrdersDataSevice implements DataAccessInterface<OrderEntity> {

    @Autowired
    private OrdersRepository ordersRepository;

    public OrdersDataSevice(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    
    /** 
     * Returns all orders
     * 
     * @return List<OrderEntity>
     */
    @Override
    public List<OrderEntity> findAll() {
        List<OrderEntity> orders = new ArrayList<OrderEntity>();
        try {
            Iterable<OrderEntity> ordersIterable = ordersRepository.findAll();
            ordersIterable.forEach(orders::add);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    @Override
    public OrderEntity FindById(long id) {
        return null;
    }

    @Override
    public boolean create(OrderEntity order) {
        try {
            this.ordersRepository.save(order);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean update(OrderEntity t) {
        return true;
    }

    @Override
    public boolean delete(OrderEntity t) {
        return true;
    }

    public boolean existsById(long id) {
        return ordersRepository.existsById(id);
    }

    public void deleteById(long id) {
        ordersRepository.deleteById(id);
    }
    
}
