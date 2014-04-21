package models;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;//Importa a anotação Entity (que não sei pra quê serve)

import play.*; //Coloquei pra caso precise
import play.db.jpa.Model; //Classe modelo


@Entity
public class Evento extends Model {
	//Por enquanto só o nome
	private static int nEvento = 0;
	private String nome;
	private int dia;
	private int mes;
	private int ano;
	private Time hora;
	
	public Evento(){
		setNome("Evento" + nEvento);
		nEvento++;
	}
	
	public Evento(String nome, int dia, int mes, int ano, Time hora){
		this.setNome(nome);
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
		this.setHora(hora);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time time) {
		this.hora = time;
	}

	
}