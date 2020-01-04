package system.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import system.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>
{
    List<Product> findAllByOrderByIdAsc();
}
