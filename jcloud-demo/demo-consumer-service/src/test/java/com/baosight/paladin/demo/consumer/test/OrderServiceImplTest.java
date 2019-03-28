package com.baosight.paladin.demo.consumer.test;

import com.baosight.paladin.demo.consumer.DemoConsumerApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

/**
 * @Author: cy
 */
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = DemoConsumerApplication.class)
@AutoConfigureStubRunner(ids = {"com.baosight.paladin:demo-provider-service:1.0-SNAPSHOT"},
        repositoryRoot = "http://119.3.52.182:8081/nexus/content/repositories/snapshots/",
        stubsMode = StubRunnerProperties.StubsMode.REMOTE)
public class OrderServiceImplTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @Rollback
    @Transactional
    public void testAddOrder() throws Exception {
        mvc.perform(MockMvcRequestBuilders
                .post("/addOrder")
                .header("username", "admin")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"orderName\":\"test order\",\"productionCode\":\"SKU001\"}".getBytes())
        ).andExpect(jsonPath("$.statusCode").value(1))
        .andReturn();

    }
}
