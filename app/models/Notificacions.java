package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Notificacions extends Model {
    public String titol;
    public String departament;

    @Lob
    public String contingut;

    @ManyToOne
    public Treballador treballador;

    public Notificacions()
    {

    }

}
