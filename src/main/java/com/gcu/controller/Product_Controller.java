package com.gcu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gcu.business.ProductsBusinessService;
import com.gcu.data.entity.ProductEntity;
import com.gcu.model.ProductModel;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/products")
public class Product_Controller {

    @Autowired 
    private ProductsBusinessService service;

    
    /**
	 * Displays the products page
	 * 
	 * @param model Model to bind to the view
	 * @return String the page
	 */
    @GetMapping("")
    public String productsPage(Model model) {
        List<ProductModel> products = service.getProducts();
        model.addAttribute("title", "Products");
        model.addAttribute("products", products);
        return "products";
    }

    /**
	 * Displays creating a new product page
	 * 
	 * @param model Model to bind to the view
	 * @return String the page
	 */
    @GetMapping("/newItem")
    public String display(Model model) {
        model.addAttribute("productModel", new ProductModel());
        model.addAttribute("title", "Add Product");
        return "new_products";
    }
    
    
    /**
   	 * Displays the error within the product page when trying to create a product
   	 * 
   	 * @param ProductModel the an instance of the product model
   	 * @param BindingResult binds the data
   	 * @Model Model model to bind to the view
   	 * 
   	 * @return String redirect url
   	 */
    @PostMapping("/createItem")
    public String createItem(@Valid ProductModel productModel, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("title", "Product Creation Form");
            return "new_products";
        }
        System.out.printf("id:%d name:%s price:$%f%n", productModel.getId(), productModel.getName(), productModel.getPrice());
        service.addProduct(new ProductEntity(productModel.getName(), productModel.getPrice()));
        
        model.addAttribute("title", "Products");
        return "redirect:/products";
    }

    /**
   	 * Display the updating product page
   	 * 
   	 * @param model Model to bind to the view
   	 * 
   	 * @return String the page
   	 */
    @GetMapping("/update")
    public String updateProduct(Model model) {
        model.addAttribute("productModel", new ProductModel());
        model.addAttribute("title", "Update Product");
        return "update_product";
    }
    
    /**
   	 * Displays the error within the product page when trying to update a product
   	 * 
   	 * @param ProductModel 
   	 * @param Boolean true means delete false means to keep
   	 * @param BindingResult binds the data
   	 * @Model Model model to bind to the view
   	 * 
   	 * @return String redirect url
   	 */
    @PostMapping("/updateProduct")
    public String updateProduct(@Valid ProductModel productModel, boolean delete, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors() && !service.exists(productModel.getId())) {
            model.addAttribute("title", "Update Product");
            return "new_products";
        }
        
        if(delete) {
            System.out.println("deleting " + productModel.getId());
            service.deleteProduct(productModel.getId());
        } else {
            System.out.printf("id:%d name:%s price:$%f%n", productModel.getId(), productModel.getName(), productModel.getPrice());
            service.addProduct(new ProductEntity(productModel.getId(), productModel.getName(), productModel.getPrice()));
        }

        
        model.addAttribute("title", "Products");
        return "redirect:/products";
    }

    /**
   	 * deletes a product based on the id
   	 * 
   	 * @param model Model to bind to the view
   	 * 
   	 * @return String the page
   	 */
    @GetMapping("/delete")
    public String deleteProduct(Model model) {
        // model.addAttribute("productModel", new ProductModel());
        model.addAttribute("title", "Update Product");
        return "delete_product";
    }
    
    
    /**
   	 * Displays the error within the product page when trying to delete a product
   	 * 
   	 * @param Long the id of the product
   	 * @Model Model model to bind to the view
   	 * 
   	 * @return String redirect url
   	 */
    @PostMapping("/deleteProduct")
    public String deleteProduct(@RequestParam long id) {
      
        System.out.println("deleting ID: " + id);
        if(service.exists(id)) {
            service.deleteProduct(id);
            return "redirect:/products";
        } else {
            return "delete_product";
        }
    }
}