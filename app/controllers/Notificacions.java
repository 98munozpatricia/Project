package controllers;

import models.Departament;
import models.Treballador;
import play.mvc.Controller;

import java.util.Objects;

public class Notificacions extends Controller {
    public static void NewNotification(String usuari, String nomdepartament, String titol, String contingut)
    {

        Departament dep= Departament.find("byNomdepartament", nomdepartament).first();
        if (dep!=null)
        {
            models.Notificacions notificacio = new models.Notificacions(dep, contingut, titol).save();
            dep.lnotificacions.add(notificacio);
            dep.save();


            Application.PaginaPrincipal(usuari);
        }
        else
        {
            renderText("Usuari o password incorrecte");

        }
    }
    public static void ShowNotifications(String departament)
    {
        Departament d= Departament.find("byNomdepartament", departament).first();
        if (d!=null)
        {
            renderJSON(d.lnotificacions);
        }
        else
        {
            renderText("Usuari o password incorrecte");

        }
    }

}
