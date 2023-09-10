package com.gcu.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProductModel {
    @NotNull(message = "Enter product id")
    private long id;

    @NotNull(message = "Enter product name")
    @Size(max = 50, message = "product name is too long")
    private String name;

    @NotNull(message = "Enter product price")
    private float price;

    
    /** 
     * ProductModel Constructor
     */
    public ProductModel() {
        
    }

    /** 
     * ProductModel Parameterized Constructor
     * 
     * @parm Long order id
     * @parm String name
     * @parm float price of the order
     */
    public ProductModel(long id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    
    
    /** 
     * return id of the product
     * 
     * @return long
     */
    public long getId() {
        return id;
    }
    
    /** 
     * sets id of the product
     * 
     * @param long
     */
    public void setId(long id) {
        this.id = id;
    }
    
    /** 
     * return name of the product
     * 
     * @return String
     */
    public String getName() {
        return name;
    }
    
    /** 
     * sets name of the product
     * 
     * @param String
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /** 
     * return price of the product
     * 
     * @return float
     */
    public float getPrice() {
        return price;
    }
    
    /** 
     * sets price of the product
     * 
     * @param float
     */
    public void setPrice(float price) {
        this.price = price;
    }    
}
