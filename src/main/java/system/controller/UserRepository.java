package system.controller;

import org.springframework.data.repository.CrudRepository;
import system.model.User;

public interface UserRepository extends CrudRepository<User, Long>
{
}
