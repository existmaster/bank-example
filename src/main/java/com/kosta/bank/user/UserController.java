package com.kosta.bank.user;

import com.kosta.bank.account.Account;
import com.kosta.bank.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserRepository userRepository;
    private final AccountRepository accountRepository;

    @Autowired
    public UserController(UserRepository userRepository, AccountRepository accountRepository) {
        this.userRepository = userRepository;
        this.accountRepository = accountRepository;
    }

    public String getAccounts(Account account){
        List<Account> result = accountRepository.findAll();
        Account result_account = result.get(0);
        return result_account.getUser().getName();
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
