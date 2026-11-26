
package com.example.banking1.service;

import com.example.banking1.entity.Account;
import com.example.banking1.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // Save a new account
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    // Get all accounts
    public List<Account> getAll() {
        return accountRepository.findAll();
    }
}
