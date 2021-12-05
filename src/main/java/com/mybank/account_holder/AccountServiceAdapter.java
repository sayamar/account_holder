package com.mybank.account_holder;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AccountServiceAdapter implements  AccountService {

    static List<Account> accountList = new ArrayList<>();

    static {
        accountList.add(new Account(2034567L,"Maruthi",001,"ASDF1234",true));
        accountList.add(new Account(3088761L,"Varalakshmi",021,"ASDF1232",true));
        accountList.add(new Account(3088761L,"Gopaala",021,"ASDF1232",true));
        accountList.add(new Account(3088761L,"Sreeprada",021,"ASDF1232",true));
    }

    @Override
    public Optional<Account> validate(Long accountNumber) {
        return accountList.stream()
                .filter(account1 -> account1.getAccountNumber().equals(accountNumber) && account1.isActive()).findAny();
    }

    @Override
    public List<Account> getAccounts() {
        return accountList;
    }

    @Override
    public Optional<Account> getAccountNameById(String accountName) {
        return accountList.
                stream()
                .filter(account -> account.getAccountName().equals(accountName)).findFirst();
    }
}
