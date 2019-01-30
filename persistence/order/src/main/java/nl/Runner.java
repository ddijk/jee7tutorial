package nl;

import javaeetutorial.order.Main;

import javax.persistence.EntityManager;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        EntityManager em = Main.getEntitiyManager();

        System.out.println("*** EVENTS:");
        showAll(em, Event.class);

        System.out.println("*** TIME TABLES:");
        showAll(em, TT.class);

    }

    private static <T> void showAll(EntityManager em, Class<T> clazz) {
        final String query = String.format("Select e from %s e", clazz.getCanonicalName());
        final List<T> records = em.createQuery(query, clazz).getResultList();

        System.out.println("aantal records "+ records.size());
        records.forEach(e -> System.out.println(e));
    }

}
