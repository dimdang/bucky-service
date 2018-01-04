package com.bucky.service.model;

import javax.persistence.*;

/**
 * Created by Dang Dim
 * Date     : 04-Jan-18, 3:53 PM
 * Email    : d.dim@gl-f.com
 */

@Entity
@Table(name="table_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false, length = 50)
    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
