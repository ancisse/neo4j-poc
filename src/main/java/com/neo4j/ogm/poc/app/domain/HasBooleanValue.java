package com.neo4j.ogm.poc.app.domain;

import java.util.Date;

public class HasBooleanValue extends HasAttValue<Boolean> {

    public HasBooleanValue() {
    }

    public HasBooleanValue(HaveAttribut eltOrRel, Attribute attribut, Boolean value) {
        super(eltOrRel, attribut, value);
    }
}