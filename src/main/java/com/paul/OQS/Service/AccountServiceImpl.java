package com.paul.OQS.Service;

import com.paul.OQS.Model.Account;
import com.paul.OQS.Repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    

    private final AccountRepo accountRepo;
    @Autowired
    public AccountServiceImpl(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    @Override
    public void addAccount(Account account) {
        accountRepo.save(account);
    }

    @Override
    public Iterable<Account> getAllAccounts() {
        return accountRepo.findAll() ;
    }

    @Override
    public Optional<Account> findAccountById(Long accountId) {
        Optional<Account> optionalAccount = accountRepo.findById(accountId);
        if (optionalAccount.isPresent()){
            Account account = optionalAccount.get();
            return Optional.of(account);
        }
        return Optional.empty();
    }


}
