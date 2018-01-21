package com.neo4j.ogm.poc.app.domain;

public class HasIntValue extends HasAttValue<Integer> {

    public HasIntValue() {
    }

    public HasIntValue(HaveAttribut eltOrRel, Attribute attribut, Integer value) {
        super(eltOrRel, attribut, value);
    }
}