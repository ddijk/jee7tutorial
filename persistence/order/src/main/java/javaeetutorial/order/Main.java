package javaeetutorial.order;

import javaeetutorial.order.entity.Part;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

//    private static EntityManagerFactory emf;
//    private static  em;

    public static void main(String[] args) {


        EntityManager  em = getEntitiyManager();

        final List<Part> parts = em.createQuery("select p from Part p", Part.class).getResultList();

        System.out.println("aantal parts is " + parts.size());
    }


    public static EntityManager getEntitiyManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("order");
        return emf.createEntityManager();

    }

}
