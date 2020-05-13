package com.sample.postgress;


import com.sample.postgress.Model.TUnixServer;
import com.sample.postgress.Repositoy.TUnixServerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @RunWith (SpringRunner.class) est utilisé pour fournir un pont entre les fonctionnalités de test Spring Boot et JUnit.
 * Chaque fois que nous utilisons des fonctionnalités de test Spring Boot dans nos tests JUnit, cette annotation sera requise.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class TUnixServerRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private TUnixServerRepository tUnixServerRepository;

    @Test
    public void whenFindByName_thenReturnEmployee() {
        TUnixServer Serveur0 = new TUnixServer("Serveur0");
        entityManager.persistAndFlush(Serveur0);

        TUnixServer found = tUnixServerRepository.findByserveurunix(Serveur0.getServeurunix());
        assertThat(found.getServeurunix()).isEqualTo(Serveur0.getServeurunix());
    }

    @Test
    public void whenInvalidName_thenReturnNull() {
        TUnixServer fromDb = tUnixServerRepository.findByserveurunix("doesNotExist");
        assertThat(fromDb).isNull();
    }

    @Test
    public void whenFindById_thenReturnEmployee() {
        TUnixServer emp = new TUnixServer("test");
        entityManager.persistAndFlush(emp);

        TUnixServer fromDb = tUnixServerRepository.findById(emp.getId()).orElse(null);
        assertThat(fromDb.getServeurunix()).isEqualTo(emp.getServeurunix());
    }

    @Test
    public void whenInvalidId_thenReturnNull() {
        TUnixServer fromDb = tUnixServerRepository.findById(-11l).orElse(null);
        assertThat(fromDb).isNull();
    }

    @Test
    public void givenSetOfEmployees_whenFindAll_thenReturnAllEmployees() {
        TUnixServer Serveur0 = new TUnixServer("Serveur0");
        TUnixServer ron = new TUnixServer("ron");
        TUnixServer bob = new TUnixServer("bob");

        entityManager.persist(Serveur0);
        entityManager.persist(bob);
        entityManager.persist(ron);
        entityManager.flush();

        List<TUnixServer> allEmployees = tUnixServerRepository.findAll();

        assertThat(allEmployees).hasSize(3).extracting(TUnixServer::getServeurunix).containsOnly(
                Serveur0.getServeurunix(),
                ron.getServeurunix(),
                bob.getServeurunix());
    }
}
