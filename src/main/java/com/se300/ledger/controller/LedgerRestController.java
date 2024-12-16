package com.se300.ledger.controller;

import com.se300.ledger.model.Account;
import com.se300.ledger.service.LedgerException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public class LedgerRestController {

    public Account createAccount() throws LedgerException {
    // Logic to create an account without using the parameter
        return new Account(); // Example return statement
    }

    public Account getAccount(@PathVariable String address) throws LedgerException {
        //TODO: Implement Get Account

        return null;
    }
}
