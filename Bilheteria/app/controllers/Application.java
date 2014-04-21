package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import play.data.validation.*;

import java.sql.Time;
import java.sql.Date;
import java.util.*;

import models.*;

public class Application extends Controller {
//Cada método static aqui corresponde a uma página (creio eu)
//Desde que exista um html com o mesmo nome
    public static void index() {
    	List<Evento> eve = Evento.all().fetch();
    	eve.add(new Evento("Teste alternativo", 1, 0, 0, null));
    	Logger.info("Resutado: " + eve.size());
    	System.out.println(eve.size());
        render(eve);
    }
    
    public static void cadastrarEvento(@Required String nome, @Required int dia, @Required int mes, @Required int ano, @Required Time hora){
    	
    	Evento evento = new Evento(nome, dia, mes, ano, hora);
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