package com.sample.postgress;

import com.sample.postgress.Model.Movie;
import com.sample.postgress.Model.SuperHero;
import com.sample.postgress.Repositoy.MovieRepository;
import com.sample.postgress.Repositoy.SuperHeroRepository;
import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.jdbc.support.JdbcUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication(scanBasePackages="com.sample")

public class PostgressApplication {

	public static void main(String[] args) {


		SpringApplication.run(PostgressApplication.class, args);

	}
}
