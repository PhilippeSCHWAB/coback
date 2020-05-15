package com.sample.postgress;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import com.sample.postgress.Model.TUnixServer;
import com.sample.postgress.Repositoy.TUnixServerRepository;
import com.sample.postgress.service.TUnixServerService;
import com.sample.postgress.service.TUnixServerServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class TUnixServerServiceImplIntegrationTest {

    @TestConfiguration
    static class TUnixServerServiceImplTestContextConfiguration {
        @Bean
        public TUnixServerService tUnixServerService() {
            return new TUnixServerServiceImpl();
        }
    }

    @Autowired
    private TUnixServerService tUnixServerService;

    @MockBean
    private TUnixServerRepository tUnixServerRepository;

    @Before
    public void setUp() {
        TUnixServer john = new TUnixServer("john");
        john.setId(11L);

        TUnixServer bob = new TUnixServer("bob");
        TUnixServer alex = new TUnixServer("alex");

        List<TUnixServer> allTUnixServers = Arrays.asList(john, bob, alex);

        Mockito.when(tUnixServerRepository.findByserveurunix(john.getServeurunix())).thenReturn(john);
        Mockito.when(tUnixServerRepository.findByserveurunix(alex.getServeurunix())).thenReturn(alex);
        Mockito.when(tUnixServerRepository.findByserveurunix("wrong_name")).thenReturn(null);
        Mockito.when(tUnixServerRepository.findById(john.getId())).thenReturn(Optional.of(john));
        Mockito.when(tUnixServerRepository.findAll()).thenReturn(allTUnixServers);
        Mockito.when(tUnixServerRepository.findById(-99L)).thenReturn(Optional.empty());
    }

    @Test
    public void whenValidName_thenTUnixServerShouldBeFound() {
        String tUnixServer = "alex";
        TUnixServer found = tUnixServerService.getTUnixServerByName(tUnixServer);

        assertThat(found.getServeurunix()).isEqualTo(tUnixServer);
    }

    @Test
    public void whenInValidName_thenTUnixServerShouldNotBeFound() {
        TUnixServer fromDb = tUnixServerService.getTUnixServerByName("wrong_name");
        assertThat(fromDb).isNull();

        verifyFindByNameIsCalledOnce("wrong_name");
    }

    @Test
    public void whenValidName_thenTUnixServerShouldExist() {
        boolean doesTUnixServerExist = tUnixServerService.exists("john");
        assertThat(doesTUnixServerExist).isEqualTo(true);

        verifyFindByNameIsCalledOnce("john");
    }

    @Test
    public void whenNonExistingName_thenTUnixServerShouldNotExist() {
        boolean doesTUnixServerExist = tUnixServerService.exists("some_name");
        assertThat(doesTUnixServerExist).isEqualTo(false);

        verifyFindByNameIsCalledOnce("some_name");
    }

    @Test
    public void whenValidId_thenTUnixServerShouldBeFound() {
        TUnixServer fromDb = tUnixServerService.getTUnixServerById(11L);
        assertThat(fromDb.getServeurunix()).isEqualTo("john");

        verifyFindByIdIsCalledOnce();
    }

    @Test
    public void whenInValidId_thenTUnixServerShouldNotBeFound() {
        TUnixServer fromDb = tUnixServerService.getTUnixServerById(-99L);
        verifyFindByIdIsCalledOnce();
        assertThat(fromDb).isNull();
    }

    @Test
    public void given3TUnixServers_whengetAll_thenReturn3Records() {
        TUnixServer alex = new TUnixServer("alex");
        TUnixServer john = new TUnixServer("john");
        TUnixServer bob = new TUnixServer("bob");

        List<TUnixServer> allTUnixServers = tUnixServerService.findAll();
        verifyFindAllTUnixServersIsCalledOnce();
        assertThat(allTUnixServers).hasSize(3).extracting(TUnixServer::getServeurunix).contains(alex.getServeurunix(), john.getServeurunix(), bob.getServeurunix());
    }

    private void verifyFindByNameIsCalledOnce(String tUnixServer) {
        Mockito.verify(tUnixServerRepository, VerificationModeFactory.times(1)).findByserveurunix(tUnixServer);
        Mockito.reset(tUnixServerRepository);
    }

    private void verifyFindByIdIsCalledOnce() {
        Mockito.verify(tUnixServerRepository, VerificationModeFactory.times(1)).findById(Mockito.anyLong());
        Mockito.reset(tUnixServerRepository);
    }

    private void verifyFindAllTUnixServersIsCalledOnce() {
        Mockito.verify(tUnixServerRepository, VerificationModeFactory.times(1)).findAll();
        Mockito.reset(tUnixServerRepository);
    }
}
