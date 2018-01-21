package com.neo4j.ogm.poc.app.domain;

import java.util.Date;

public class HasDateValue extends HasAttValue<Date> {

    public HasDateValue() {
    }

    public HasDateValue(HaveAttribut eltOrRel, Attribute attribut, Date value) {
        super(eltOrRel, attribut, value);
    }
}