package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.controller.Registration_Controller;
import com.gcu.data.entity.ProductEntity;
import com.gcu.data.repository.ProductsRepository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class ProductsDataSevice implements DataAccessInterface<ProductEntity> {

    @Autowired
    private ProductsRepository productsRepository;
    private static final Logger logger = LoggerFactory.getLogger(ProductsDataSevice.class);

    public ProductsDataSevice(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    
    /** 
     * @return List<ProductEntity>
     */
    @Override
    public List<ProductEntity> findAll() {
        List<ProductEntity> products = new ArrayList<ProductEntity>();
        try {
            Iterable<ProductEntity> productsIterable = productsRepository.findAll();
            productsIterable.forEach(products::add);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public ProductEntity FindById(long id) {
        return productsRepository.findById(id).get();
    }

    @Override
    public boolean create(ProductEntity product) {
    	logger.info("Entering ProductsDataSevice.create()");
        try {
            this.productsRepository.save(product);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("ProductsDataSevice.create() Production Creation failed: "+e);
            logger.info("Exiting ProductsDataSevice.create()");
            return false;
        }
        logger.info("ProductsDataSevice.create() Production Creation successful");
        logger.info("Exiting ProductsDataSevice.create()");
        return true;
    }

    @Override
    public boolean update(ProductEntity t) {
    	logger.info("Entering ProductsDataSevice.update()");
        return true;
    }

    @Override
    public boolean delete(ProductEntity t) {
        return true;
    }

    public boolean existsById(long id) {
        return productsRepository.existsById(id);
    }

    public void deleteById(long id) {
    	logger.info("Entering ProductsDataSevice.deleteById()");
        productsRepository.deleteById(id);
        logger.info("Product id: "+id+" deletion successful.");
        logger.info("Exiting ProductsDataSevice.deleteById()");
    }
    
}
