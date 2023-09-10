package com.gcu.data.entity;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("PRODUCTS")
public class ProductEntity {

    @Id
    private long id;
    
    @Column("NAME")
    private String name;

    @Column("PRICE")
    private float price;

    
    /**
     *  ProductEntity default constructor 
     */
    public ProductEntity() {
        
    }

    /**
     *  ProductEntity Parameterized constructor  without id
     * 
     *  @param String name
     *  @param float price
     */
    public ProductEntity(String name, float price) {
        this.name = name;
        this.price = price;
    }

    /**
     *  ProductEntity Parameterized constructor  with id
     * 
     *  @param Long id
     *  @param String name
     *  @param float price
     */
    public ProductEntity(long id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    
    /** 
     * Returns id
     * 
     * @return long
     */
    public long getId() {
        return id;
    }

    /** 
     * Sets id
     * 
     * @param Long id
     */
    public void setId(long id) {
        this.id = id;
    }

    
    /** 
     * Returns name
     * 
     * @return String
     */
    public String getName() {
        return name;
    }

    /** 
     * Sets product name
     * 
     * @param String productName
     */
    public void setName(String productName) {
        this.name = productName;
    }

    /** 
     * Returns price
     * 
     * @return float
     */
    public float getPrice() {
        return price;
    }

    /** 
     * Sets price
     * 
     * @param float price
     */
    public void setPrice(float price) {
        this.price = price;
    }

    
}
