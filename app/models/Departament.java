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

    @OneToMany (mappedBy = "nom", cascade = CascadeType.ALL)
    public List<Treballador> ltreballadors= new ArrayList<Treballador>();

    public Departament(String n, int num)
    {
        this.nomdepartament=n;
        this.numtreballadors=num;
    }
}
