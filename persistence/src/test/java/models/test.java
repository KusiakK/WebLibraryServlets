package models;


import org.junit.Test;
import repositories.AuthorRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class test {

    @Test
    public void test() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        AuthorRepository authorRepository = new AuthorRepository(entityManager);
    }
}