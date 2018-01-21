package com.neo4j.ogm.poc.app.domain;

public class HasStringValue extends HasAttValue<String> {

    public HasStringValue() {
    }

    public HasStringValue(HaveAttribut eltOrRel, Attribute attribut, String value, String locale) {
        super(eltOrRel, attribut, value, locale);
    }
}