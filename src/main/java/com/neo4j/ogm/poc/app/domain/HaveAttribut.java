package com.neo4j.ogm.poc.app.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Relationship;

import com.neo4j.ogm.poc.app.relationship.GraphRelationType;

public class HaveAttribut<P extends HaveAttribut>  {

    /**
     * Universal unique id pour l'�l�ment.
     */
    @Index//(indexName = "elt_index")
    protected String uuid;

    @Relationship(type=GraphRelationType.HAS_ATT_VALUE)
    private Set<HasAttValue> attValues = new HashSet<HasAttValue>();

    @Relationship(type = GraphRelationType.INSTANCE_OF_ELEMENT, direction = Relationship.OUTGOING)
    private P parent;

    /**
     * Indique si l'�l�ment est r�utilisable ou non.
     */
    private boolean reusable;

    /**
     * Url d'une ic�ne que l'on peut associer � l'�l�ment.
     */
    private String iconUrl;

    /**
     * Num�ro d'ordre d'un �l�ment parmis un ensemble d'�l�ment (organisation des missions par exemple).
     * Commence � 1.
     */
    private int order;
    private Integer index;

    public HaveAttribut() {

    }

    /**
     * Ajout d'un lien porteur d'une valeur bool�ene entre l'�lement this et un attribut.
     *
     * @param attribut attribut bool�en � ajouter
     * @param value valeur par d�faut
     * @return le lien porteur de la valeur bool�enne
     */
    public HasBooleanValue addBooleanAttVal(Attribute attribut, boolean value) {
        if (attValues == null) {
        	attValues = new HashSet<HasAttValue>();
        }
        HasBooleanValue hasBooleanValue = new HasBooleanValue(this, attribut, value);

        attValues.add(hasBooleanValue);
        return hasBooleanValue;
    }

    /**
     * Ajout d'un lien porteur d'une valeur String localis�e entre l'�lement this et un attribut.
     *
     * @param attribut attribut String � ajouter
     * @param value valeur par d�faut
     * @param locale pr�cise la langue dans laquelle est donn� la valeur d'attribut.
     * @return le lien porteur de la valeur String
     */
    public HasStringValue addStringAttVal(Attribute attribut, String value, String locale) {
        if (attValues == null) {
        	attValues = new HashSet<HasAttValue>();
        }
        HasStringValue hasStringValue = new HasStringValue(this, attribut, value, locale);
        attValues.add(hasStringValue);
        return hasStringValue;
    }

    /**
     * Ajout d'un lien porteur d'une valeur de type date entre l'�lement this et un attribut.
     *
     * @param attribut attribut Date � ajouter
     * @param value valeur par d�faut
     * @return le lien porteur de la valeur date
     */
    public HasDateValue addDateAttVal(Attribute attribut, Date value) {
        if (attValues == null) {
            attValues = new HashSet<HasAttValue>();
        }
        HasDateValue hasDateValue = new HasDateValue(this, attribut, value);
        attValues.add(hasDateValue);
        return hasDateValue;
    }

    /**
     * Ajout d'un lien porteur d'une valeur de type 'Nombre entier' entre l'�lement this et un attribut.
     *
     * @param attribut attribut Int � ajouter
     * @param value valeur par d�faut
     * @return le lien porteur de la valeur integer
     */
    public HasIntValue addIntAttVal(Attribute attribut, int value) {
        if (attValues == null) {
        	attValues = new HashSet<HasAttValue>();
        }
        HasIntValue hasIntValue = new HasIntValue(this, attribut, value);
        attValues.add(hasIntValue);
        return hasIntValue;
    }

    /**
     * Ajout d'un lien porteur d'une valeur de type 'Nombre floatant' entre l'�lement this et un attribut.
     *
     * @param attribut attribut Int � ajouter
     * @param value valeur par d�faut
     * @return le lien porteur de la valeur integer
     */
    public HasFloatValue addFloatAttVal(Attribute attribut, Float value) {
        if (attValues == null) {
        	attValues = new HashSet<HasAttValue>();
        }
        HasFloatValue hasFloatValue = new HasFloatValue(this, attribut, value);
        attValues.add(hasFloatValue);
        return hasFloatValue;
    }

    public Set<HasAttValue> getAttValues() {
        return attValues;
    }

    public void setAttValues(Set<HasAttValue> attributs) {
        this.attValues = attributs;
    }

    public P getParent() {
        return parent;
    }

    public void setParent(P parent) {
        this.parent = parent;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public boolean isReusable() {
        return reusable;
    }

    public void setReusable(boolean reusable) {
        this.reusable = reusable;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
