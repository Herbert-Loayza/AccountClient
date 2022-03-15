package com.bootcamp.businessaccount.repositoy;

import com.bootcamp.businessaccount.entity.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AccountRepository extends ReactiveMongoRepository<Account, String> {
}
