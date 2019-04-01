package com.jcloud.demo.provider.test;

//import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

/**
 * @Author: cy
 */
//@AutoConfigureMessageVerifier
@RunWith(SpringRunner.class)
@DirtiesContext
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class MockBase {

    @Autowired
    private WebApplicationContext context;

   /* @Before
    public void setUp() {
        RestAssuredMockMvc.webAppContextSetup(context);
    }*/
}
