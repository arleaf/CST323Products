package com.gcu.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RegisterModel {
    @NotNull(message = "enter first name")
    @Size(max = 32, message = "first name is too long")
    private String firstName;

    @NotNull(message = "enter last name")
    @Size(max = 32, message = "last name is too long")
    private String lastName;

    private String username;

    @NotNull(message = "enter email")
    @Size(max = 32, message = "email is too long")
    private String email;
    
    @NotNull(message = "enter password")
    @Size(min = 10, max = 32, message = "password must be between 10 and 32 characters")
    private String password;

    @NotNull(message = "enter password")
    @Size(min = 10, max = 32, message = "password must be between 10 and 32 characters")
    private String confirmPassword;
    
    @NotNull(message = "enter address")
    @Size(min = 1, max = 64, message = "address must be between 1 and 64 characters")
    private String address;
    
    @NotNull(message = "enter phone")
    @Size(min = 1, max = 64, message = "phone number must be between 10 and 11 characters")
    private String phone;

    
    /** 
     * return first name of the registered user
     * 
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    /** 
     * sets firstName of registered user
     * 
     * @param String
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** 
     * return last name of the registered user
     * 
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    /** 
     * sets lastName of registered user
     * 
     * @param String
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** 
     * return email of the registered user
     * 
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /** 
     * sets email of registered user
     * 
     * @param String
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** 
     * return password of the registered user
     * 
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /** 
     * sets ConfirmPassword of registered user
     * 
     * @param String
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    
    /** 
     * return ConfirmPassword of the registered user
     * 
     * @return String
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /** 
     * sets password of registered user
     * 
     * @param String
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /** 
     * return address of the registered user
     * 
     * @return String
     */
    public String getAddress() {
        return address;
    }

    /** 
     * sets address of registered user
     * 
     * @param String
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /** 
     * return phone num of the registered user
     * 
     * @return String
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * sets phone num of registered user
     * 
     * @param String
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /** 
     * return username of the registered user
     * 
     * @return String
     */
    public String getUsername() {
        return username;
    }

    /** 
     * sets username of registered user
     * 
     * @param String
     */
    public void setUsername(String username) {
        this.username = username;
    }

    
}
