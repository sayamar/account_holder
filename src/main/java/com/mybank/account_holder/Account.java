package com.mybank.account_holder;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
public class Account {

    private Long accountNumber;
    private String accountName;
    private int branch;
    private String ifscCode;
    private boolean isActive;


}
