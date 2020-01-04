package system.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import system.model.User;

public interface UserRepository extends JpaRepository<User, Long>
{
    @Query("SELECT u FROM User u WHERE u.name=:name and u.password=:password")
    List<User> findUserByNameAndPassword(@Param("name") String name,
        @Param("password") String password);

    User findFirstByOrderByIdDesc();
}
