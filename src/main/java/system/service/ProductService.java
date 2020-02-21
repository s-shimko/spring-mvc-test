package system.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.ProductDao;
import system.model.Product;

@Service
public class ProductService
{
    @Autowired
    private ProductDao productDao;

    public List<Product> getAllProducts(){
        return productDao.getAllProducts();
    }

    public Product getProduct(String id) {
        return productDao.getProductById(id);
    }
}
