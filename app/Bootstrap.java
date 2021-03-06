import play.*;
import play.jobs.*;
import play.test.*;

import models.*;

@OnApplicationStart
public class Bootstrap extends Job {

    public void doJob() {
        // Check if the database is empty
        if(Departament.count() == 0) {
            Departament administracio = new Departament("Administracio", 10, "administracio123").save();
            Departament produccio = new Departament("Produccio", 10, "produccio123").save();
            Departament comercial = new Departament("Comercial", 10, "comercial123").save();
            Departament direccio = new Departament("Direccio", 2, "direccio123").save();
            Treballador t = new Treballador("Patricia", 2, administracio, "patri98", "patri123").save();
            administracio.ltreballadors.add(t);
            Treballador t2 = new Treballador("Patri", 1, direccio, "patri2", "patri2").save();
            administracio.ltreballadors.add(t2);
            administracio.save();
        }
    }

}