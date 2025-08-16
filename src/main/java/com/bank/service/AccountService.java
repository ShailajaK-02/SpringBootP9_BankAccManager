package com.bank.service;

import com.bank.entity.Account;

import java.util.List;

public interface AccountService
{
    //save method added
    String saveAccount(Account account);

    //getalldata
    List<Account> getAllAccData();

    Account getAccById(int id);

    String deleteAcc(int id);

    Account updateAcc(int id, Account newAcc);

    String saveList(List<Account> accountList);
}
