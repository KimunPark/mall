package pkm.mall.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pkm.mall.models.User;
import pkm.mall.repositories.UserRepository;

import java.util.List;

@Controller
@RequestMapping(path = "/demo")
public class MainController {

    private final UserRepository userRepository;

    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping(path = "/add")
    @ResponseBody
    public String addNewUser(@RequestParam String name, @RequestParam String email) {
        User newUser = userRepository.save(new User(name, email));
        return "saved" + newUser.getName();
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
