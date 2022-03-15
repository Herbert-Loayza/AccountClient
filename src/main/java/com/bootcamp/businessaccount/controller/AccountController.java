package com.bootcamp.businessaccount.controller;

import com.bootcamp.businessaccount.entity.Account;
import com.bootcamp.businessaccount.service.AcoountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/accountclients")
public class AccountController {

    @Autowired
    private AcoountService acoountService;

    @GetMapping
    public Flux<Account> getAll(){
        return acoountService.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Account> findById(@PathVariable String id){
        return acoountService.findById(id);
    }

    @PostMapping("/update")
    public Mono<Account> create(@RequestBody Account account){
        return acoountService.save(account);
    }

    @PutMapping("/{id}")
    public Mono<Account> update(@RequestBody Account account){
        return acoountService.update(account);
    }

    @DeleteMapping("/{id}")
    public Mono<Void>deleteById(@PathVariable("id") String id){
        return null;
    }









}
