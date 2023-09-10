package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.data.entity.OrderEntity;
import com.gcu.data.entity.ProductEntity;
import com.gcu.model.OrderModel;
// import com.gcu.model.ProductList;
import com.gcu.model.ProductModel;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/service")
public class RestService {

    @Autowired
    private ProductsBusinessService productsService;

    @Autowired
    private OrdersBusinessService ordersService;

    
    /** 
     * @return List<ProductModel>
     */
    @GetMapping(path="/getproducts", produces={MediaType.APPLICATION_JSON_VALUE})
    public List<ProductModel> getProductsAsJson() {
        return productsService.getProducts();
    }

    @GetMapping(path="/getorders", produces={MediaType.APPLICATION_JSON_VALUE})
    public List<OrderModel> getOrdersAsJson() {
        return ordersService.getOrders();
    }

    // @GetMapping(path="/getxml", produces={MediaType.APPLICATION_XML_VALUE})
    // public ProductList getOrdersAsXml() {
    //     ProductList list = new ProductList();
    //     list.setProducts(service.getProducts());
    //     return list;
    // }

    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "found product", 
          content = { @Content(mediaType = "application/json", 
            schema = @Schema(implementation = ProductModel.class)) }),
        @ApiResponse(responseCode = "404", description = "product not found", 
          content = @Content) })
    @GetMapping(path="/getproduct/{id}")
    public ResponseEntity<ProductModel> getProduct(@PathVariable long id) {
        if(productsService.exists(id)) {
            ProductModel product = productsService.getProduct(id);
            return new ResponseEntity<ProductModel>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path="/addproduct")
    public ProductModel addProduct(@RequestBody ProductModel product) {
        boolean isSuccess = productsService.addProduct(new ProductEntity(product.getName(), product.getPrice()));
        if(isSuccess) {
            return product;
        }
        return null;
    }

    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "found product", 
          content = { @Content(mediaType = "application/json", 
            schema = @Schema(implementation = ProductModel.class)) }),
        @ApiResponse(responseCode = "404", description = "product not found", 
          content = @Content) })
    @PostMapping(path="/updateproduct")
    public ResponseEntity<ProductModel> updateProduct(@RequestBody ProductModel product) {
        System.out.printf("id:%d name:%s price:$%f%n", product.getId(), product.getName(), product.getPrice());
        if(productsService.exists(product.getId())) {
            boolean isSuccess = productsService.addProduct(new ProductEntity(product.getId(), product.getName(), product.getPrice()));
            if(isSuccess) {
                return new ResponseEntity<ProductModel>(product, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "found product", 
          content = { @Content(mediaType = "application/json") }),
        @ApiResponse(responseCode = "404", description = "product not found", 
          content = @Content) })
    @GetMapping(path="/deleteproduct/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable long id) {
        if(productsService.exists(id)) {
            productsService.deleteProduct(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(path="/addorder")
    public OrderModel addOrder(@RequestBody OrderModel order) {
        System.out.printf("id:%d name:%s price:$%f%n", order.getId(), order.getProductName(), order.getPrice());
        boolean isSuccess = ordersService.addOrder(new OrderEntity(order.getOrderNo(), order.getProductName(), order.getPrice(), order.getQuantity()));
        if(isSuccess) {
            return order;
        }
        return null;
    }

        @PostMapping(path="/updateorder")
        public OrderModel updateOrder(@RequestBody OrderModel order) {
            System.out.printf("id:%d name:%s price:$%f%n", order.getId(), order.getProductName(), order.getPrice());
            if(ordersService.exists(order.getId())) {
                boolean isSuccess = ordersService.addOrder(new OrderEntity(order.getId(), order.getOrderNo(), order.getProductName(), order.getPrice(), order.getQuantity()));
                if(isSuccess) {
                    return order;
                }
            }
            return null;
        }

        @GetMapping(path="deleteorder/{id}")
        public void deleteOrder(@PathVariable long id) {
            if(ordersService.exists(id)) {
                ordersService.deleteOrder(id);
            }
        }

    // @PostMapping(path="/addUser")
    // public void addUser(@RequestBody RegisterModel user) {
    //      usersService.addUser(new UserEntity(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword(), null, null))
    // }
}
