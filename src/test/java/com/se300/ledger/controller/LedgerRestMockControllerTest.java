package com.se300.ledger.controller;

import com.se300.ledger.SmartStoreApplication;
import com.se300.ledger.TestSmartStoreApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

public class LedgerRestMockControllerTest {

    @Test
    public void testGetAccountById() throws Exception {

        //TODO: Implement Test Retrieving Account by Id Mock Testing
    }
}
