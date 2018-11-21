package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Notificacions extends Model {
    public String titol;

    @Lob
    public String contingut;

    @ManyToOne
    public Departament departament;

    public Notificacions(Departament dep, String contingut, String titol)
    {
        this.contingut=contingut;
        this.titol=titol;
        this.departament=dep;

    }

}
