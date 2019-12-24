package system.controller;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
@RequestMapping("/users")
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/validate", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView validateUser()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userFromServer", new User());
        modelAndView.setViewName("users-check-page");
        return modelAndView;
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public @ResponseBody
    String checkUser(@ModelAttribute("userFromServer") User user)
    {
        SessionFactory db = userService.getDb(User.class);
        Session session = db.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        User user1 = session.get(User.class, 1);
        return user1.toString();

//        String result = "invalid";
//        if ("admin".equals(user.getName()) && "admin".equals(user.getPassword()))
//        {
//            result = "valid";
//        }
//        return result;
    }
}
