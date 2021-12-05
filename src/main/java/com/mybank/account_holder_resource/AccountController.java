package com.mybank.account_holder_resource;

import com.mybank.account_holder.Account;
import com.mybank.account_holder.AccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/validate/{accountNumber}")
    public ResponseEntity<Account> validate(
            @PathVariable @NonNull String accountNumber) {
        log.info("AccountController {} ",accountNumber);
        return ResponseEntity.of(accountService.validate(Long.valueOf(accountNumber)));

    }

    @GetMapping("/accounts")
    public ResponseEntity<List<Account>> getAccounts() {
        return ResponseEntity.
                ok(accountService.getAccounts());
    }

    @GetMapping("/accountByName")
    public ResponseEntity<Account> getAccountById(@RequestParam String accountName) {
        return ResponseEntity.of(accountService.getAccountNameById(accountName));
    }

}
