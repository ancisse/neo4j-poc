package com.neo4j.ogm.poc.app.domain;

import org.apache.commons.lang3.StringUtils;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import java.util.Objects;

import com.neo4j.ogm.poc.app.relationship.GraphRelationType;

@RelationshipEntity(type = GraphRelationType.HAS_ATT_VALUE)
public  class HasAttValue<T> extends Entity {

    @StartNode
    private HaveAttribut eltOrRel;

    @EndNode
    private Attribute attribute;

    /**
     * Indique s'il s'agit d'une valeur pour un attribut-type ou pour un attribut valorisé.
     */
    private boolean attType;

    /**
     * <p>Locale de la valeur de l'attribut. Peut être null dans le cas
     * d'un attribut non localisé (booléen par exemple)</p>
     */
    private String locale;

    private T value;

    public HasAttValue() {
    }

    public HasAttValue(HaveAttribut eltOrRel, Attribute attribute, T value, String locale) {
        this.eltOrRel = eltOrRel;
        this.attribute = attribute;
        this.value = value;
        this.locale = locale;
    }

    public HasAttValue(HaveAttribut eltOrRel, Attribute attribute, T value) {
        this(eltOrRel, attribute, value, StringUtils.EMPTY);
    }

    protected HasAttValue(HaveAttribut eltOrRel) {
        this.eltOrRel = eltOrRel;
    }

    public HaveAttribut getEltOrRel() {
        return eltOrRel;
    }

    public void setEltOrRel(HaveAttribut eltOrRel) {
        this.eltOrRel = eltOrRel;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isAttType() {
        return attType;
    }

    public void setAttType(boolean attType) {
        this.attType = attType;
    }

}
