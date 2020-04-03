package com.dijkrosoft.roster.request;

import com.dijkrosoft.roster.entity.*;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class RosterRequestBean {

    @PersistenceContext
    EntityManager em;

    private static int i = 1;

    public void createPlayer(String name, String position) {

        System.out.println("RosterController initialized");
        try {

            Player frenkie = new Player(String.valueOf(i++), name, position, 1_000_000d);

            em.persist(frenkie);
            System.out.println("Player saved");
        } catch (Exception ex) {
            System.out.println("Rolling back now.");
        }

    }

    public void createTeam(String teamName, String leagueName, String city, List<String> playerNames) {
        try {

            Team team = new Team(String.valueOf(i++), teamName, city);

            for (String playerName : playerNames) {
                final TypedQuery<Player> playerTypedQuery = em.createNamedQuery("findPlayerByName", Player.class);
//                final TypedQuery<Player> playerTypedQuery = em.createQuery("select p from Player p where p.name=:name", Player.class);
                playerTypedQuery.setParameter("name", playerName);
                team.addPlayer(playerTypedQuery.getSingleResult());

                League league = em.createNamedQuery("findLeagueByName", League.class)
                        .setParameter("name", leagueName)
                        .getSingleResult();
                team.setLeague(league);
            }

            System.out.println(String.format("Team %s has %d players", teamName, team.getPlayers().size()));

            em.persist(team);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Oops." + ex);
        }

    }

    public void createLeague(String name, String sport) {

        League league = null;
        try {
            league = new SummerLeague(String.valueOf(i++), name, sport);
            em.persist(league);
        } catch (IncorrectSportException e) {
            e.printStackTrace();
        }

    }

}
