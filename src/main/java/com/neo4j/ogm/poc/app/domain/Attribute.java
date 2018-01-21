package com.neo4j.ogm.poc.app.domain;

import java.util.UUID;

import org.neo4j.ogm.annotation.Index;

import com.neo4j.ogm.poc.app.relationship.AttributTypeEnum;

public class Attribute{

    /**
     * Universal unique id pour l'attribut.
     */
    @Index//(indexName = "att_index")
    private String uuid;

    private boolean mandatory;

    private boolean editable;

    private boolean animation;

    private boolean display;

    private boolean richText;

    private boolean textArea;

    private boolean isLocalized;

    private String format;

    private  AttributTypeEnum attType;

    /**
     * Constructeur appelé par Neo4J.
     * <p/>
     * Rien ne doit être setté ici (surtout pas l'UUID qui serait modifié à chaque demande de l'attribut en base)
     */
    @SuppressWarnings("unused")
    private Attribute() {
        this.attType = null;
    }

    public Attribute(AttributTypeEnum attType) {
        this.uuid = UUID.randomUUID().toString();
        this.attType = attType;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public boolean isAnimation() {
        return animation;
    }

    public void setAnimation(boolean animation) {
        this.animation = animation;
    }

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

    public boolean isRichText() {
        return richText;
    }

    public void setRichText(boolean richText) {
        this.richText = richText;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public AttributTypeEnum getAttType() {
        return attType;
    }

    public boolean isLocalized() {
        return isLocalized;
    }

    public void setLocalized(boolean isLocalized) {
        this.isLocalized = isLocalized;
    }
    public boolean isTextArea() {
        return textArea;
    }

    public void setTextArea(boolean textArea) {
        this.textArea = textArea;
    }
}
