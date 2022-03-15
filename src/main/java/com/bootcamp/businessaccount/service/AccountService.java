package com.bootcamp.businessaccount.service;

import com.bootcamp.businessaccount.entity.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountService {

    public Flux<Account>findAll();
    public Mono<Account>findById(String id);
    public Mono<Account>save(Account account);
    public Mono<Account> update(Account account);
    public Mono<Void>deleteById(Account account);

}
