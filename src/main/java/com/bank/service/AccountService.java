package com.bank.service;

import com.bank.entity.Account;

import java.util.List;

public interface AccountService
{
    String saveAccount(Account account);

    List<Account> getAllAccData();

    Account getAccById(int id);
}
