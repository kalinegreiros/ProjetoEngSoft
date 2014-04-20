package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import play.data.validation.*;

import java.util.*;

import models.*;

public class Application extends Controller {
//Cada método static aqui corresponde a uma página (creio eu)
//Desde que exista um html com o mesmo nome
    public static void index() {
    	List<Evento> eve = Evento.all().fetch();
    	eve.add(new Evento("Teste alternativo"));
    	Logger.info("Resutado: " + eve.size());
    	System.out.println(eve.size());
        render(eve);
    }
    
    public static void cadastrarEvento(@Required String nome){
    	
    	Evento evento = new Evento(nome);
		/*if (validation.hasErrors()) {
			render("Application/inserir.html", evento);
		}*///Quando tiver validação faz algo assim

		evento.save();
		index();
    }
    
    public static void eventos() {
    	render();    	
    }
    
    public static void ingressos() {
    	render();    	
    }
    
}