package controllers;

import models.Departament;
import play.mvc.With;


@With(Secure.class)
@CRUD.For(Departament.class)
public class AdminDepartament extends CRUD {
}
