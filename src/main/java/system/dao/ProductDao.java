package system.dao;


import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import system.model.Product;

@Repository
public class ProductDao extends SessionDao
{
    public List<Product> getAllProducts(){
        Query query = buildSessionFactory(Product.class).createEntityManager().createQuery("from Product");
        return query.getResultList();
    }
}
