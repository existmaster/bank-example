package com.kosta.bank.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //@GetMapping(path = "users")
    //@RequestMapping(path = "/hello", method = RequestMethod.GET)
    public List<User> hello(){
        List<User> users = userRepository.findAll();
        return users;
    }

    //@PostMapping(path = "users")
    //@RequestMapping(path = "/hello", method = RequestMethod.POST)
    public User hello2(@RequestBody User user){
        User result = userRepository.save(user);
        return result;
    }
}
