package com.yqc.controller;

import com.yqc.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by yangqc on 2017/8/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = ApplicationContext.class)
@ActiveProfiles("test")
public class ApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getCertificate() throws Exception {
        String username = "test-upload-file";
        String url = "http://localhost:" + this.port + "/api/user";
        User user = new User();
        user.setAge(12);
        user.setFavorite("篮球");
        user.setName("超超");
        ResponseEntity apiResponse = restTemplate.postForEntity(url, user, String.class);
        assertNotNull(apiResponse);
        String body = apiResponse.getBody().toString();
        assertEquals("Spring Framework upload file example", body);
        assertEquals(HttpStatus.NO_CONTENT, apiResponse.getStatusCode());
    }
}
