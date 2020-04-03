/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 * <p>
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dijkrosoft.roster.request;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;
import java.util.List;

/**
 * @author ian
 */
@Service
public class RosterConfigBean implements InitializingBean {

    public static final String PRIMERA_DIVISION = "primera division";
    public static final String VIRGIL_VAN_DIJK = "Virgil van Dijk";
    public static final String PREMIER_LEAGUE = "Premier League";
    public static final String WK = "WK";
    public static final String FRENKIE_DE_JONG = "Frenkie de Jong";
    public static final String MATTHIJS_DE_LIGT = "Matthijs de Ligt";
    public static final String EREDIVISIE = "eredivisie";
    @Autowired
    private RosterRequestBean request;

    public void createData() {

        request.createLeague(EREDIVISIE, "soccer");
        request.createLeague(PRIMERA_DIVISION, "soccer");
        request.createLeague(PREMIER_LEAGUE, "soccer");
        request.createLeague(WK, "soccer");

        request.createPlayer(FRENKIE_DE_JONG, "middenveld");
        request.createPlayer(MATTHIJS_DE_LIGT, "verdediging");
        request.createPlayer("Lionel Messi", "aanvaller");
        request.createPlayer(VIRGIL_VAN_DIJK, "verdediging");
        request.createPlayer("Brian Linssen", "aanvaller");


        request.createTeam("ajax", EREDIVISIE, "amsterdam", List.of(FRENKIE_DE_JONG, MATTHIJS_DE_LIGT));
        request.createTeam("FC Barcelona", PRIMERA_DIVISION, "barcelona", List.of("Lionel Messi"));
        request.createTeam("Oranje", WK, "Johannesburg", List.of(VIRGIL_VAN_DIJK, FRENKIE_DE_JONG, MATTHIJS_DE_LIGT));


    }

    @PreDestroy
    public void deleteData() {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Creating data:");
        createData();
        System.out.println("Creating data DONE");
    }
}
