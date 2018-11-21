package controllers;

import models.Departament;
import play.mvc.Controller;

public class Departaments extends Controller {
    public static void login(String nom, String contrasenya)
    {
        Departament dep= Departament.find("byNomdepartamentAndContrasenya", nom, contrasenya).first();
        if (dep!=null)
        {
            String nomdep=dep.nomdepartament;
            Application.register2(nomdep);

            renderText("Login correcte. Benvingut al servidor");

        }
        else
        {
            renderText("Usuari o password incorrecte");

        }
    }


}
