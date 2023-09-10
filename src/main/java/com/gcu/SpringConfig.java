package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

import com.gcu.business.OrdersBusinessService;
import com.gcu.business.ProductsBusinessService;

@Configuration
@EnableJdbcRepositories("com.gcu.data.repository")
public class SpringConfig {
    
    
	/** 
     * Used to create a bean for orderBusinessService
     * 
     * @return ordersBusinessService returns productBusinessService instance
     */
    @Bean(name="ordersBusinessService", initMethod ="init", destroyMethod ="destroy")
    public OrdersBusinessService getOrdersBusiness() {
        return new OrdersBusinessService();
    }

    /** 
     * Used to create a bean for productBusinessService
     * 
     * @return ProductsBusinessService returns productBusinessService instance
     */
    @Bean(name="productsBusinessService", initMethod ="init", destroyMethod ="destroy")
    public ProductsBusinessService getProductsBusiness() {
        return new ProductsBusinessService();
    }
}
