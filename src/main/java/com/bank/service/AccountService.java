package com.bank.service;

import com.bank.entity.Account;

import java.util.List;

public interface AccountService
{
    //save method added
    String saveAccount(Account account);

    //getalldata
    List<Account> getAllAccData();

    //getbyid
    Account getAccById(int id);

    //delete
    String deleteAcc(int id);

    //update
    Account updateAcc(int id, Account newAcc);

    //savelist
    String saveList(List<Account> accountList);
}
