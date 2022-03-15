package com.bootcamp.businessaccount.service;

import com.bootcamp.businessaccount.entity.Account;
import com.bootcamp.businessaccount.repositoy.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class AccountServiceImpl implements AcoountService{

    @Autowired
    private AccountRepository accountRepository;


    @Override
    public Flux<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Mono<Account> findById(String id) {
        return accountRepository.findById(id);
    }

    @Override
    public Mono<Account> save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Mono<Account> update(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Mono<Void> deleteById(Account account) {
        return accountRepository.deleteById(account);
    }
}
