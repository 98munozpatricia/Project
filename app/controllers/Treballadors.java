package controllers;

import models.Departament;
import models.Treballador;
import play.mvc.Controller;

import javax.swing.text.html.HTML;

public class Treballadors extends Controller {

    public static void login(String usuari, String contrasenya)
    {
        validation.required(usuari);
        validation.required(contrasenya);
        if(validation.hasErrors()) {
            params.flash(); // add http parameters to the flash scope
            validation.keep(); // keep the errors for the next request
            Application.login("Es necessari omplir els camps especificats");
        }
        Treballador t= Treballador.find("byUsuariAndContrasenya", usuari, contrasenya).first();
        if (t!=null)
        {
           Application.PaginaPrincipal(t.usuari);
        }
        else
        {
            Application.login("Usuari o contrasenya incorrecte");
        }
    }
    public static void loginAndroid(String usuari, String contrasenya)
    {
        Treballador t= Treballador.find("byUsuariAndContrasenya", usuari, contrasenya).first();
        if (t!=null)
        {
            renderText("OK: Benvingut al servidor");
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
            Application.login("");
        }
        else
        {
            Application.register();
        }
    }


}
