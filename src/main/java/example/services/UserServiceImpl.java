package example.services;

import java.util.List;
import example.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getUsers()
    {
        RowMapper userRowMapper = (rs, rowNumber) -> new User(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getString("password"),
            rs.getString("role")
        );
        return jdbcTemplate.query("SELECT * FROM User", userRowMapper);
    }
}
