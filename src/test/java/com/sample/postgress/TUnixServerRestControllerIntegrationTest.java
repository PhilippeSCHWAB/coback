package com.sample.postgress;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.IOException;
import java.util.List;


import com.sample.postgress.Model.TUnixServer;
import com.sample.postgress.Repositoy.TUnixServerRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = PostgressApplication.class)
@AutoConfigureMockMvc 
// @TestPropertySource(locations = "classpath:application-integrationtest.properties")
@AutoConfigureTestDatabase
public class TUnixServerRestControllerIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private TUnixServerRepository repository;

    @After
    public void resetDb() {
        repository.deleteAll();
    }

    @Test
    public void whenValidInput_thenCreateTUnixServer() throws IOException, Exception {
        TUnixServer bob = new TUnixServer("bob");
        mvc.perform(post("/api/serveurunix").contentType(MediaType.APPLICATION_JSON).content(JsonUtil.toJson(bob)));

        List<TUnixServer> found = repository.findAll();
        assertThat(found).extracting(TUnixServer::getServeurunix).containsOnly("bob");
    }

    @Test
    public void givenTUnixServers_whenGetTUnixServers_thenStatus200() throws Exception {
        createTestTUnixServer("bob");
        createTestTUnixServer("alex");

        // @formatter:off
        mvc.perform(get("/api/serveurunix").contentType(MediaType.APPLICATION_JSON))
          .andDo(print())
          .andExpect(status().isOk())
          .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
          .andExpect(jsonPath("$", hasSize(greaterThanOrEqualTo(2))))
          .andExpect(jsonPath("$[0].serveurunix", is("bob")))
          .andExpect(jsonPath("$[1].serveurunix", is("alex")));
        // @formatter:on
    }

    //

    private void createTestTUnixServer(String serveurunix) {
        TUnixServer emp = new TUnixServer(serveurunix);
        repository.saveAndFlush(emp);
    }

}
