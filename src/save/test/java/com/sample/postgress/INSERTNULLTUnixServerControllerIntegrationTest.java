package com.sample.postgress;

import com.sample.postgress.Model.TUnixServer;
import com.sample.postgress.controller.TUnixServerController;
import com.sample.postgress.service.TUnixServerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(TUnixServerController.class)
public class INSERTNULLTUnixServerControllerIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private TUnixServerService service;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void whenPostTUnixServer_thenCreateTUnixServer() throws Exception {
        TUnixServer alex = new TUnixServer("alex");
        given(service.save(Mockito.any())).willReturn(alex);

        mvc.perform(post("/api/serveurunix").contentType(MediaType.APPLICATION_JSON).content(JsonUtil.toJson(alex))).andExpect(status().isCreated()).andExpect(jsonPath("$.name", is("alex")));
        verify(service, VerificationModeFactory.times(1)).save(Mockito.any());
        reset(service);
    }

    @Test
    public void givenTUnixServers_whenGetTUnixServers_thenReturnJsonArray() throws Exception {
        TUnixServer alex = new TUnixServer("alex");
        TUnixServer john = new TUnixServer("john");
        TUnixServer bob = new TUnixServer("bob");

        List<TUnixServer> allTUnixServers = Arrays.asList(alex, john, bob);

        given(service.findAll()).willReturn(allTUnixServers);

        mvc.perform(get("/api/serveurunix").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andExpect(jsonPath("$", hasSize(3))).andExpect(jsonPath("$[0].name", is(alex.getServeurunix()))).andExpect(jsonPath("$[1].name", is(john.getServeurunix())))
                .andExpect(jsonPath("$[2].serveurunix", is(bob.getServeurunix())));
        verify(service, VerificationModeFactory.times(1)).findAll();
        reset(service);
    }

}
