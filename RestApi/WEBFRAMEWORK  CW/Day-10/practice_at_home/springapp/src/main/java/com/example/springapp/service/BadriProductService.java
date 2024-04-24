package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.BadriProduct;
import com.example.springapp.repository.BadriProductRepo;

@Service
public class BadriProductService {
    @Autowired
    private BadriProductRepo productRepo;

    public boolean saveProduct(BadriProduct product)
    {
        try
        {
            productRepo.save(product);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public List<BadriProduct> findByCategoryList(String category)
    {
        return productRepo.findByCategoryList(category);
    }

    public BadriProduct updateProduct(int productId, int quantityInStock)
    {
        productRepo.updateQuantity(productId, quantityInStock);
        return productRepo.findById(productId).orElse(null);
    }

    public BadriProduct deleteProduct(int productId)
    {
        productRepo.deleteProduct(productId);
        return productRepo.findById(productId).orElse(null);
    }
}