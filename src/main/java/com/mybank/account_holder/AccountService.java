package com.mybank.account_holder;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    Optional<Account> validate(Long accountNumber);
    List<Account> getAccounts();
    Optional<Account> getAccountNameById(String accountName);
}
