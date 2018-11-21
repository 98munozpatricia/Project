package controllers;

import models.Departament;
import models.Treballador;
import play.mvc.Controller;

public class Treballadors extends Controller {
    public static void login(String usuari, String contrasenya)
    {
        Treballador t= Treballador.find("byUsuariAndContrasenya", usuari, contrasenya).first();
        if (t!=null)
        {

           Application.PaginaPrincipal(t.usuari);
        }
        else
        {
            renderText("Usuari o password incorrecte"+usuari+contrasenya);
        }
    }
    public static void addTreballador(String nomdep, String nom, int ncontrol, String usuari, String contrasenya)
    {
        Departament d= Departament.find("byNomdepartament", nomdep).first();
        Treballador t= Treballador.find("byUsuari", usuari).first();

        if (t==null && d!=null)
        {

            d.addTreballador(nom,ncontrol,usuari,contrasenya);
            Application.login();
        }
        else
        {
            Application.register();
        }
    }


}
