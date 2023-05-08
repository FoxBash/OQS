package com.paul.OQS.Service;

import com.paul.OQS.Model.Account;

import java.util.Optional;

public interface AccountService {
    Account addAccount(Account account);
    Iterable<Account> getAllAccounts();
    Optional<Account> findAccountById(Long accountId);
    void deleteAccountById(Long id);

}
