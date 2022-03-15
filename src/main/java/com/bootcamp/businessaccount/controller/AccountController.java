package com.bootcamp.businessaccount.controller;

import com.bootcamp.businessaccount.entity.Account;
import com.bootcamp.businessaccount.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public Flux<Account> getAll(){
        return accountService.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Account> findById(@PathVariable String id){
        return accountService.findById(id);
    }

    @PostMapping("/update")
    public Mono<Account> create(@RequestBody Account account){
        return accountService.save(account);
    }

    @PutMapping("/{id}")
    public Mono<Account> update(@RequestBody Account account){
        return accountService.update(account);
    }

    @DeleteMapping("/{id}")
    public Mono<Void>deleteById(@PathVariable("id") String id){
        return null;
    }









}
