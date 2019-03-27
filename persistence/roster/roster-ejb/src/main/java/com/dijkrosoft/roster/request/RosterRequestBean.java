package com.dijkrosoft.roster.request;

import com.dijkrosoft.roster.entity.Player;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class RosterRequestBean {

    @PersistenceContext
    EntityManager em;


    public void createPlayer() {

        System.out.println("RosterController initialized");
        try {

//            em.getTransaction().begin();
            Player frenkie = new Player("1", "Frenkie de Jong", "middenveld", 1_000_000d);

            em.persist(frenkie);
//            em.getTransaction().commit();
            System.out.println("Player saved");
        } catch (Exception ex) {
            System.out.println("Rolling back now.");
//            em.getTransaction().rollback();
        }

    }
}
