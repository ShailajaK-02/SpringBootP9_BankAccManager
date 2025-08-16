package com.bank.serviceImpl;

import com.bank.entity.Account;
import com.bank.repository.AccountRepository;
import com.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService
{
    //Inject repository in this
    @Autowired
    private AccountRepository repository;

    //save method implemented
    @Override
    public String saveAccount(Account account) {
        repository.save(account);
        return "Account Added";
    }

    //getalldata method implemented commit
    @Override
    public List<Account> getAllAccData() {
        List<Account> accountList = repository.findAll();
        return accountList;
    }

    //getbyid method implemented commit
    @Override
    public Account getAccById(int id) {
        Account accountById = repository.findById(id).orElseThrow(()->new NullPointerException("Data not found"+id));
        return accountById;
    }

    @Override
    public String deleteAcc(int id) {
        repository.deleteById(id);
        return "Account deleted";
    }

    @Override
    public Account updateAcc(int id, Account newAcc) {
       Account account = repository.findById(id).orElseThrow(()-> new NullPointerException("Data not found"));

       account.setAccType(newAcc.getAccType());

       Account updatedAcc = repository.save(account);

       return updatedAcc;
    }

    @Override
    public String saveList(List<Account> accountList) {
        List<Account> accounts = repository.saveAll(accountList);
        return "List saved";
    }
}
