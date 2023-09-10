package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.ProductsDataSevice;
import com.gcu.data.entity.ProductEntity;
import com.gcu.model.ProductModel;

public class ProductsBusinessService {

    @Autowired
    private ProductsDataSevice service;

    
    /**
     * Used to test the ProudctsBusinessService class
     */
    public void test() {
        System.out.println("Hello from the OrdersBusinessService");
    }

    
    /** 
     * Get's the products from the product entity
     * 
     * @return List<ProductModel> returns a listed product model object
     */
    public List<ProductModel> getProducts() {
        // service.create(new ProductEntity("example", 70.1f));
        List<ProductEntity> productsEntity = service.findAll();
        List<ProductModel> productsDomain = new ArrayList<ProductModel>();
        for (ProductEntity entity : productsEntity) {
            productsDomain.add(new ProductModel(entity.getId(),
                                                entity.getName(),
                                                entity.getPrice()));
        }
        return productsDomain;
    }

    /** 
     * Get's the product based on id
     * 
     * @return ProductModel returns product based of the id
     */
    public ProductModel getProduct(long id) {
        ProductEntity entity = service.FindById(id);
        return new ProductModel(entity.getId(),
            entity.getName(),
            entity.getPrice());
    }

    /** 
     * Adds the product to ProductDataService
     * 
     * @param ProductEntity the product to be added
     */
    public boolean addProduct(ProductEntity product) {
        return service.create(product);
    }

    
    /** 
     * Initialize the ProductBusinessService
     */
    public void init() {
        System.out.println("Initializing ProductsBusinessService :)");
    }

    /** 
     * Destroy the ProductBusinessService
     */
    public void destroy() {
        System.out.println("Destroying ProductsBusinessService :(");
    }

    /** 
     * Used to check if the product exists already in the ProductDataService
     * 
     * @param long the id of the product
     */
    public boolean exists(long id) {
        return service.existsById(id);
    }

    /** 
     * Deletes the product from ProductDataService
     * 
     * @param long the id of the product
     */
    public void deleteProduct(long id) {
        service.deleteById(id);
    }
    
  
    
    
}
