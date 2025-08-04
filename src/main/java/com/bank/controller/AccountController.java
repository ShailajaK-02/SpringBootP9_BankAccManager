package com.bank.controller;

import com.bank.entity.Account;
import com.bank.service.AccountService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController
{
    //inject service in controller
    @Autowired
    private AccountService accountService;

    //add data
    @PostMapping("/addData")
    public ResponseEntity<String> addData(@RequestBody Account account){
        System.err.println(account);
        accountService.saveAccount(account);
        return new ResponseEntity<>("Account created", HttpStatus.CREATED);
    }

    //Get all data
    @GetMapping("/getAllData")
    public ResponseEntity<List<Account>> getAllData(){
        List<Account> accountList = accountService.getAllAccData();
        return new ResponseEntity<>(accountList,HttpStatus.OK);
    }

    //get Dta by id
    @GetMapping("/getDataById/{id}")
    public ResponseEntity<Account> getById(@PathVariable("id") int id){
        Account accById = accountService.getAccById(id);
        return new ResponseEntity<>(accById,HttpStatus.OK);
    }
}
