package com.paul.OQS.Service;

import com.paul.OQS.Model.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    void addAccount(Account account);
    Iterable<Account> getAllAccounts();
    Optional<Account> findAccountById(Long accountId);

}
