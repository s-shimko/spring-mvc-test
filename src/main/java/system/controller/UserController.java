package system.controller;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import system.model.User;
import system.service.UserService;

@Controller
@RequestMapping("/")
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping({"/", "/login"})
    public ModelAndView showLoginPage()
    {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("loginUser", new User());
        return mav;
    }

    @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView loginUser(@ModelAttribute("loginUser") User user)
    {
        return new ModelAndView("status-page", "status_message", "User login: " + userIsInDb(user));
    }

    @RequestMapping("/registration")
    public ModelAndView showRegistrationPage()
    {
        return new ModelAndView("registration", "registerUser", new User());
    }

    @RequestMapping(value = "/registrationProcess", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView registerUser(@ModelAttribute("registerUser") User user)
    {
        SessionFactory db = userService.getDb(User.class);
        Session session = db.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        User addedUser =
            (User) session.createQuery("from User ORDER BY id DESC").setMaxResults(1)
                .uniqueResult();
        session.close();
        return new ModelAndView("status-page", "status_message",
            "User register: " + addedUser.toString());
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    private User userIsInDb(User user)
    {
        String hql =
            "FROM User WHERE name='" + user.getName() + "' and password='" + user.getPassword() +
                "'";
        SessionFactory db = userService.getDb(User.class);
        Session session = db.openSession();
        session.beginTransaction();
        Query query = session.createQuery(hql);
        List users = query.list();
        return users.size() > 0 ? (User) users.get(0) : null;
    }
}
