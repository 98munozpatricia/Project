package models;

import play.db.jpa.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Departament extends Model {
    public String nomdepartament;
    public int numtreballadors;
    public String contrasenya;

    @OneToMany
    public List<Treballador> ltreballadors= new ArrayList<Treballador>();
    @OneToMany
    public List<Notificacions> lnotificacions= new ArrayList<Notificacions>();

    public Departament(String n, int num, String contrasenya)
    {
        this.nomdepartament=n;
        this.numtreballadors=num;
        this.contrasenya= contrasenya;
    }
    public Departament addTreballador(String nom, int ncontrol, String usuari, String contrasenya) {
        Treballador treballador = new Treballador(nom, ncontrol, this, usuari, contrasenya).save();

        this.ltreballadors.add(treballador);
        this.save();
        return this;
    }
}
