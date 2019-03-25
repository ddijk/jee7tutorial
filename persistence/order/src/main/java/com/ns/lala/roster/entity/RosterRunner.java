package com.ns.lala.roster.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class RosterRunner {
    public static void main(String[] args) {


        EntityManager  em = getEntitiyManager();

//        final List<Part> parts = em.createQuery("select p from Part p", Part.class).getResultList();

        em.getTransaction().begin();
        WinterLeague winterLeague = new WinterLeague("1", "super prestige", "skiing");
        winterLeague.name="mooie beschrijving van wintersport";
                em.persist(winterLeague);

        SummerLeague summerLeague = new SummerLeague("2", "olympics", "swimming");
        summerLeague.name="mooie beschrijving van zomersport";
                em.persist(summerLeague);

        em.getTransaction().commit();



        System.out.println("Sports saved " );

        final List<Tag> leagues = em.createQuery("select g from League g ", Tag.class).getResultList();

        System.out.println("Aantal leagues: "+ leagues.size());
        leagues.forEach(g -> printTag(g));

    }

    private static void print(League g) {
        System.out.println("class: "+ g.getClass());

        if ( g instanceof WinterLeague) {
            final WinterLeague g1 = (WinterLeague) g;
            System.out.println(g1.name);
        }
        if ( g instanceof SummerLeague) {
            final SummerLeague g1 = (SummerLeague) g;
            System.out.println(g1.name);
        }
        System.out.println("End of print");
    }

    private static void printTag(Tag t) {
        System.out.println(String.format("Tag %s %s",t.getId(), t.getName()));
    }

    public static EntityManager getEntitiyManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("order");
        return emf.createEntityManager();

    }
}
