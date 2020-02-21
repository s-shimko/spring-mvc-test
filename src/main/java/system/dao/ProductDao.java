package system.dao;


import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import system.model.Product;

@Repository
public class ProductDao extends SessionDao
{
    public List<Product> getAllProducts(){
        Query query = SessionDao.getInstance().createEntityManager().createQuery("from Product");
        return query.getResultList();
    }

    public Product getProductById(String id) {
        Query query = SessionDao.getInstance().createEntityManager().createQuery("from Product where id = :id");
        query.setParameter("id", Long.parseLong(id));
        return (Product) query.getSingleResult();
    }
}
