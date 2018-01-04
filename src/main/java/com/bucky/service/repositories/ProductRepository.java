package com.bucky.service.repositories;

import com.bucky.service.model.Product;

import java.util.List;

/**
 * Created by Dang Dim
 * Date     : 04-Jan-18, 2:47 PM
 * Email    : d.dim@gl-f.com
 */

public interface ProductRepository {

    public List<Product> getAllProducts();
    public boolean addProduct(Product product);
    public boolean updateProduct(Product product);
    public boolean deleteProduct(Product product);
    public List<Product> finProductById(int id);
}
