package models;


import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;


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


