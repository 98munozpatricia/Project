package controllers;

import models.Treballador;
import play.mvc.Controller;

public class Treballadors extends Controller {
    public static void login(String usuari, String contraseña)
    {
        Treballador t= Treballador.find("byUsuariAndContraseña", usuari, contraseña).first();
        if (t!=null)
        {
            renderText("Login correcte. Benvingut al servidor");
        }
        else
        {
            renderText("Usuari o password incorrecte");
        }
    }
}
