package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import system.model.Product;
import system.service.ProductService;
import system.service.ShopSessionService;

@Controller
@RequestMapping("/products")
public class ProductController
{
    @Autowired
    private ProductService productService;


    @RequestMapping("/list")
    public ModelAndView showProducts()
    {
        ModelAndView mav = new ModelAndView("products-page");
        mav.addObject("products", ShopSessionService.getShopSession().getProducts());
        mav.addObject("loggedUser", ShopSessionService.getShopSession().getUser().getName());
        mav.addObject("purchasedProducts", ShopSessionService.getShopSession().getPurchasedProducts());
        return mav;
    }

    @RequestMapping(value="/buy/{id}", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView buy(@PathVariable("id") String productId) {
        Product product = productService.getProduct(productId);
        ShopSessionService.getShopSession().buyProduct(product);
        return showProducts();
    }

    @RequestMapping(value="/remove/{id}", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView removePurchasedProduct(@PathVariable("id") String productId) {
        Product product = productService.getProduct(productId);
        ShopSessionService.getShopSession().removeProduct(product);
        return showProducts();
    }
}
