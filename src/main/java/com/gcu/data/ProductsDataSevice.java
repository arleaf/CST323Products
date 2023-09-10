package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.entity.ProductEntity;
import com.gcu.data.repository.ProductsRepository;

@Service
public class ProductsDataSevice implements DataAccessInterface<ProductEntity> {

    @Autowired
    private ProductsRepository productsRepository;

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
        try {
            this.productsRepository.save(product);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean update(ProductEntity t) {
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
        productsRepository.deleteById(id);
    }
    
}
