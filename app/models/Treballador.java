package models;

import play.db.jpa.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Treballador extends Model {
    public int nivellcontrol;
    public String nom;
    public String usuari;
    public String contrasenya;

    @ManyToOne
    public Departament departament;

    public Treballador (String n, int e, Departament dep, String u, String c)
    {
        this.nom=n;
        this.nivellcontrol=e;
        this.departament=dep;
        this.usuari=u;
        this.contrasenya=c;
    }


}
