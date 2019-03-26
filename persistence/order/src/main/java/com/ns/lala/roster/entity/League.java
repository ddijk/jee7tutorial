/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 * <p>
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package com.ns.lala.roster.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

import static javax.persistence.CascadeType.ALL;


@Entity
@Table(name = "PERSISTENCE_ROSTER_LEAGUE")
@Data
public abstract class League implements Serializable {
    private static final long serialVersionUID = 5060910864394673463L;
    protected String id;
    protected String naam;
    protected String sport;
    protected Collection<Team> teams;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @OneToMany(cascade = ALL, mappedBy = "league")
    public Collection<Team> getTeams() {
        return teams;
    }

    public void setTeams(Collection<Team> teams) {
        this.teams = teams;
    }

    public void addTeam(Team team) {
        this.getTeams().add(team);
    }

    public void dropTeam(Team team) {
        this.getTeams().remove(team);
    }

}
