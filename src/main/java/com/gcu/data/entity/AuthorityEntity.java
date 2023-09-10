package com.gcu.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("authorities")
public class AuthorityEntity {

    @Id
    long id;

    @Column("username")
    String username;

    @Column("authority")
    String authority;

    /**
     *  AuthorityEntity default constructor 
     */
    public AuthorityEntity() {
    }

    /**
     *  AuthorityEntity Parameterized constructor  
     *  
     *  @param String username
     *  @parm String authority
     */
    public AuthorityEntity(String username, String authority) {
        this.username = username;
        this.authority = authority;
    }
    
    /** 
     * Returns id
     * 
     * @return Long
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
     * Returns authority
     * 
     * @return String
     */
    public String getAuthority() {
        return authority;
    }

    /** 
     * Sets authority
     * 
     * @param String authority
     */
    public void setAuthority(String authority) {
        this.authority = authority;
    }

    
}
