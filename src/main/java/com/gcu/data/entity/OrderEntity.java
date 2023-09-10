package com.gcu.data.entity;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("ORDERS")
public class OrderEntity {

    @Id
    private long id;

    @Column("ORDER_NO")
    private String orderNo;
    
    @Column("PRODUCT_NAME")
    private String productName;

    @Column("PRICE")
    private float price;

    @Column("QUANTITY")
    private int quantity;

    
    /** 
     * Returns id
     * 
     * @return long
     */
    public long getId() {
        return id;
    }
    
    /**
     *  OrderEntity default constructor 
     */
    public OrderEntity() {

    }

    /**
     *  UserEntity Parameterized constructor  without id
     *  
     *  @param String orderNo
     *  @param String productName
     *  @param Float price
     *  @param int Quantity
     */
    public OrderEntity(String orderNo, String productName, float price, int quantity) {
        this.orderNo = orderNo;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     *  UserEntity Parameterized constructor  with id
     *  
     *  @param Long id
     *  @param String orderNo
     *  @param String productName
     *  @param Float price
     *  @param int Quantity
     */
    public OrderEntity(long id, String orderNo, String productName, float price, int quantity) {
        this.id = id;
        this.orderNo = orderNo;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
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
     * Returns orderNo
     * 
     * @return String
     */
    public String getOrderNo() {
        return orderNo;
    }

    /** 
     * Sets orderNo
     * 
     * @param String
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /** 
     * Returns product name
     * 
     * @return String
     */
    public String getProductName() {
        return productName;
    }
    
    /** 
     * Sets product name
     * 
     * @param String productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
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

    /** 
     * Returns quantity
     * 
     * @return int
     */
    public int getQuantity() {
        return quantity;
    }

    /** 
     * Sets quantity
     * 
     * @param int Quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
