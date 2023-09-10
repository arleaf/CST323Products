package com.gcu.model;

public class OrderModel {
    private long id;
    private String orderNo, productName;
    private float price;
    private int quantity;

    
    /** 
     * OrderModel Parameterized Constructor
     * 
     * @parm Long order id
     * @parm String Order number
     * @parm String product name
     * @parm float price of the order
     * @parm int Quantity of the order
     */
    public OrderModel(long id, String orderNo, String productName, float price, int quantity) {
        this.id = id;
        this.orderNo = orderNo;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    
    /** 
     * OrderModel Constructor
     * 
     */
    public OrderModel() {
		
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
     * @param long id value of the order
     */
    public void setId(long id) {
        this.id = id;
    }
    
    /** 
     * Returns OrderNo
     * 
     * @return String
     */
    public String getOrderNo() {
        return orderNo;
    }
    
    /** 
     * Sets the orderNo
     * 
     * @param String order number
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    
    /** 
     * Returns ProductName
     * 
     * @return String
     */
    public String getProductName() {
        return productName;
    }
    
    /** 
     * Sets productName
     * 
     * @param String set ProductName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    /** 
     * Returns price
     * 
     * @return float returns price of the order
     */
    public float getPrice() {
        return price;
    }
    
    /** 
     * Sets price
     * 
     * @param float the price of the order
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
    /** 
     * Returns Quantity
     * 
     * @return int the quantity of the order
     */
    public int getQuantity() {
        return quantity;
    }
    
    /** 
     * Sets quantity
     * 
     * @param int the quantity of the order
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
