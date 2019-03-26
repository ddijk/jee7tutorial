/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package com.ns.lala.roster.entity;


import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
public class SummerLeague extends League implements Serializable{
    private static final long serialVersionUID = 4846138039113922695L;

    String name;
    /** Creates a new instance of SummerLeague */
    public SummerLeague() {
    }
    
    public SummerLeague(String id, String name, String sport) 
            throws RuntimeException {
        this.id = id;
        this.name = name;
        if (sport.equalsIgnoreCase("swimming") ||
                sport.equalsIgnoreCase("soccer") ||
                sport.equalsIgnoreCase("basketball") ||
                sport.equalsIgnoreCase("baseball")) {
            this.sport = sport;
        } else {
            throw new RuntimeException("Sport is not a summer sport.");
        }
    }


}
