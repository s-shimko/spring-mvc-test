package system.dao;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import system.model.Product;
import system.repos.ProductRepository;

@Repository
public class ProductDao
{
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAllByOrderByIdAsc();
    }
}
