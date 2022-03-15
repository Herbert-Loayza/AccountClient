package com.bootcamp.businessaccount.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(value = "account_client")
public class Account {

    @Id
    private String id;
    private String accountNumber;
    private String Amount;
    private Date createdAccount;
    private String accountType;


}
