package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import entity.User;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/users")
    public ArrayList<User> users() {
        ArrayList<User> users = new ArrayList<User>();
        User user1 = new User();
        user1.setName("Jackie1");
        user1.setAge(18);
        users.add(user1);
        User user2 = new User();
        user2.setName("Jackie2");
        user2.setAge(28);
        users.add(user2);
        return users;
    }
    
}
