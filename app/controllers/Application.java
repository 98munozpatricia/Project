package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
       // Treballador treballador1= new Treballador("Joan",23, "Direcotr", "joangarcia", "joan23");
    }
    public static void IniBD()
    {
        Departament administracio = new Departament("Administració", 5).save();
        Treballador treballador1= new Treballador("Joan", 2, administracio, "joangarcia", "joan23").save();
        administracio.ltreballadors.add(treballador1);
        administracio.save();
        Departament depart = Departament.find("bynomdepartaments","Administració").first();

    }

    public static void login (String n, String p)
    {
        renderText("benvinguts al servidor"+n);
    }
    public static void addDepartament()
    {
        Departament administracio = new Departament("Administració", 5).save();
        Treballador t1= new Treballador("Jordi", 2, administracio, "jordigarcia", "jordi43").save();
        Treballador treballador1= new Treballador("Joan", 2, administracio, "joangarcia", "joan23").save();
        administracio.ltreballadors.add(treballador1);
        administracio.save();
        renderText("Treballador:"+administracio.ltreballadors.get(0).nivellcontrol);

    }
    public static void removeDepartament()
    {
        Departament d= Departament.find("bynomdepartament", "Administració").first();
        d.delete();
    }


}
