package com.paul.OQS.Controller;

import com.paul.OQS.Model.Account;
import com.paul.OQS.Service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/account/v1")
public class AccountController {
    private final AccountServiceImpl accountService;
    @Autowired
    public AccountController(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public Iterable<Account> getAllAccount(){
        return accountService.getAllAccounts();
    }
    @PostMapping
    public Account createAccount(@RequestBody Account account){
        return accountService.addAccount(account);
    }
    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable("id") Long id){
        Optional<Account> optionalAccount = accountService.findAccountById(id);
        if (optionalAccount.isPresent()){
            Account account = optionalAccount.get();
            return account;
        }

        return null;
    }
    @PutMapping("/{id}")
    public Account editAccount(@PathVariable("id") Long id,@RequestBody Account account){
        Optional<Account> optionalAccount = accountService.findAccountById(id);
        if (optionalAccount.isPresent()){
            account.setId(id);
            accountService.addAccount(account);
            return account;
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public void removeAccount(@PathVariable("id") Long id){
        accountService.deleteAccountById(id);
    }

}
