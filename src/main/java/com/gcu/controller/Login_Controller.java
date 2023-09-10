package com.gcu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Login_Controller {

	/**
	 * LoginController that returns a view along with a Model Attribute
	 * @param model Model to bind to the view
	 * 
	 * @return View name login
	 */
    @GetMapping("/login")
    public String display(Model model) {
        model.addAttribute("title", "Login Form");
        // model.addAttribute("loginModel", new LoginModel());
        return "login";
    }
    
    /**
     * Handles the login form submission and redirects the user to the orders page if successful.
     *
     * @param loginModel the login form model containing user input data
     * @param bindingResult the result of the validation process for the registration form model
     * @param model the Spring MVC model object used to pass data to the view
     * 
     * @return  view name orders
     */
    // @PostMapping("/doLogin")
    // public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {

    //     System.out.printf("username: %s password: %s%n", loginModel.getEmail(), loginModel.getPassword());
    //     if(bindingResult.hasErrors()) {
    //         model.addAttribute("title", "Login Form");
    //         return "login";
    //     }
        
    //     //Authenticate User
    //     try {
	// 		if(!loginModel.authenticate()) {
	// 		    model.addAttribute("title", "Login Form");
	// 		    return "login";
	// 		}
	// 	} catch (SQLException e) {
	// 		// TODO Auto-generated catch block
	// 		e.printStackTrace();
	// 	}
        
    //     List<ProductModel> products = service.getProducts();
    //     model.addAttribute("title", "My Products");
    //     model.addAttribute("products", products);

    //     return "products";
    // }
    
    
    
}
