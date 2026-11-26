
package com.example.banking1.controller;

import com.example.banking1.entity.Account;
import com.example.banking1.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // Create a new account
    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.saveAccount(account);
    }

    // Get all accounts
    @GetMapping
    public List<Account> getAll() {
        return accountService.getAll();
    }
}
