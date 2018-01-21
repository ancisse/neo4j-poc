package com.neo4j.ogm.poc.app.domain;

import java.util.Date;

public class HasFloatValue extends HasAttValue<Float> {

    public HasFloatValue() {
    }

    public HasFloatValue(HaveAttribut eltOrRel, Attribute attribut, Float value) {
        super(eltOrRel, attribut, value);
    }
}