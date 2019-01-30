package nl;

import javaeetutorial.order.Main;

import javax.persistence.EntityManager;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        EntityManager em = Main.getEntitiyManager();

//        showEvents(em);

//        System.out.println("*** TIME TABLES:");
//        showAll(em, TT.class);


        final String query = "Select e from TT e";
        final List<TT> records = em.createQuery(query, TT.class).getResultList();

        records.forEach(t->{

            System.out.println("timetable: "+ t);
            t.events.forEach( e -> System.out.println("\t\tevent:"+e));
        });

    }

    private static void showEvents(EntityManager em) {
        System.out.println("*** EVENTS:");
        showAll(em, Event.class);
    }

    private static <T> void showAll(EntityManager em, Class<T> clazz) {
        final String query = String.format("Select e from %s e", clazz.getCanonicalName());
        final List<T> records = em.createQuery(query, clazz).getResultList();

        System.out.println("aantal records "+ records.size());
        records.forEach(e -> System.out.println(e));
    }



}
