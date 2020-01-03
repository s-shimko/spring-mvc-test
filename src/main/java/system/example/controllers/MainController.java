package system.example.controllers;

import system.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import system.model.Product;
import system.service.ProductService;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @Value("${application.message: BlaBla!}")
    private String message = "Default Message";

    @Autowired
    private UserService userService;

    @GetMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }

    @GetMapping(value = "/userList")
    public ModelAndView getUsers(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("users", userService.getUsers());
        return modelAndView;
    }

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/productsList")
    public ModelAndView getProducts(){
        ModelAndView modelAndView = new ModelAndView();
        List<Product> allProducts = productService.getAllProducts();
        modelAndView.addObject("products", allProducts);
        modelAndView.setViewName("products");
        return modelAndView;
    }

}
