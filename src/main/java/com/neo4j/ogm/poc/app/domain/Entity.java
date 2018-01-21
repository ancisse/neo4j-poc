package com.neo4j.ogm.poc.app.domain;
import java.util.Date;
import java.util.Objects;

import org.neo4j.ogm.annotation.*;

public abstract class Entity {
    @GraphId
    protected Long id;
    //@Convert(OnMapDateConverter.class)
    private Date created = new Date();
    //@Convert(OnMapDateConverter.class)
    private Date modified = new Date();
   // @CreatedBy
    private String creator;
   // @LastModifiedBy
    private String modifier;


    protected boolean deleted;

    /**
     * Indique si une copie de cet élément est en cours. Il ne peut pas être modifié pendant une copie (à gérer par le front uniquement).
     */
    private boolean copyRunning;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }


    public boolean isCopyRunning() {
        return copyRunning;
    }

    public void setCopyRunning(boolean copyRunning) {
        this.copyRunning = copyRunning;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Entity other = (Entity) obj;
        return Objects.equals(this.id, other.id);
    }
}