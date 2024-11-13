/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author vldmrk
 */
public class Poruka implements Serializable {

    private int porId;
    private User posiljalacId;
    private User primalacId;
    private String text;
    private Date vreme;

    public Poruka() {
    }

    public Poruka(int porId, User posiljalacId, User primalacId, String text, Date vreme) {
        this.porId = porId;
        this.posiljalacId = posiljalacId;
        this.primalacId = primalacId;
        this.text = text;
        this.vreme = vreme;
    }

    public int getPorId() {
        return porId;
    }

    public void setPorId(int porId) {
        this.porId = porId;
    }

    public User getPosiljalacId() {
        return posiljalacId;
    }

    public void setPosiljalacId(User posiljalacId) {
        this.posiljalacId = posiljalacId;
    }

    public User getPrimalacId() {
        return primalacId;
    }

    public void setPrimalacId(User primalacId) {
        this.primalacId = primalacId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getVreme() {
        return vreme;
    }

    public void setVreme(Date vreme) {
        this.vreme = vreme;
    }

    @Override
    public String toString() {
        return "Poslao: " + posiljalacId + ": " + text;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Poruka other = (Poruka) obj;
        if (this.porId != other.porId) {
            return false;
        }
        if (this.posiljalacId != other.posiljalacId) {
            return false;
        }
        if (this.primalacId != other.primalacId) {
            return false;
        }
        if (!Objects.equals(this.text, other.text)) {
            return false;
        }
        return Objects.equals(this.vreme, other.vreme);
    }

}
