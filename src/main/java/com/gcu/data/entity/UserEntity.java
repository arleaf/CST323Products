package com.gcu.data.entity;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
public class UserEntity {

    @Id
    private Long id;
    
    @Column("username")
    private String username;

    @Column("PASSWORD")
    private String password;

    @Column("enabled")
    private boolean enabled;

    @Column("F_NAME")
    private String firstName;

    @Column("L_NAME")
    private String lastName;

    @Column("EMAIL")
    private String email;

    
    @Column("ADDRESS")
    private String address;
    
    @Column("PHONE")
    private String phone;

    /**
     *  UserEntity default constructor 
     */
    public UserEntity() {
    }

    /**
     *  UserEntity Parameterized constructor  without id
     *  
     *  @param String username
     *  @param String password
     *  @param Boolean enabled
     *  @param String firstName
     *  @param String lastName
     *  @param String email
     *  @param String address
     *  @param String phone
     */
    public UserEntity(String username, String password, boolean enabled, String firstName, String lastName,
            String email, String address, String phone) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    
    /**
     *  UserEntity Parameterized constructor  with id
     *  
     *  @param Long id
     *  @param String username
     *  @param String password
     *  @param Boolean enabled
     *  @param String firstName
     *  @param String lastName
     *  @param String email
     *  @param String address
     *  @param String phone
     */
    public UserEntity(Long id, String username, String password, boolean enabled, String firstName, String lastName,
            String email, String address, String phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }
    
    /** 
     * Returns username
     * 
     * @return String
     */
    public String getUsername() {
        return username;
    }

    /** 
     * Sets username
     * 
     * @param String username
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /** 
     * Returns password
     * 
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /** 
     * Sets password
     * 
     * @param String password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /** 
     * Returns enabled whether true or false
     * 
     * @return Boolean
     */
    public boolean isEnabled() {
        return enabled;
    }

    /** 
     * Sets enabled
     * 
     * @param Boolean enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    /** 
     * Returns first name
     * 
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    /** 
     * Sets first name
     * 
     * @param String firstname
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /** 
     * Returns lastName
     * 
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    /** 
     * Sets last name
     * 
     * @param String last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /** 
     * Returns email
     * 
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /** 
     * Sets email
     * 
     * @param String email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** 
     * Returns address
     * 
     * @return String
     */
    public String getAddress() {
        return address;
    }

    /** 
     * Sets address
     * 
     * @param String address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /** 
     * Returns phone number
     * 
     * @return String
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * Sets phone number
     * 
     * @param String phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    /** 
     * Returns id
     * 
     * @return long
     */
    public Long getId() {
        return id;
    }

    /** 
     * Sets id
     * 
     * @param Long id
     */
    public void setId(Long id) {
        this.id = id;
    }

    
    
}
