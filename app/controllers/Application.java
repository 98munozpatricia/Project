package controllers;

import models.Notificacions;
import net.sf.ehcache.search.expression.Not;
import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

import javax.swing.text.html.HTML;

public class Application extends Controller {

    public static void index() {
        render();

    }

    public static void login ()
    {
        render();

    }
    public static void register ()
    {
        render();

    }
    public static void register2 (String nomdep)
    {
        render(nomdep);

    }
    public static void PaginaPrincipal (String usuari)
    {
        Treballador treballador= Treballador.find("byUsuari", usuari).first();
        String nom=treballador.nom;
        int n=treballador.nivellcontrol;
        String departament=treballador.departament.nomdepartament;
        render(usuari,nom,n,departament);

    }
    public static void newNotification (String departament, String usuari)
    {

        render(departament, usuari);

    }
    public static void showNotifications(String departament, String usuari) {

        Departament dep= Departament.find("byNomdepartament", departament).first();
        List<Notificacions> lnot = dep.lnotificacions;
        render(lnot, departament, usuari);
    }






}
