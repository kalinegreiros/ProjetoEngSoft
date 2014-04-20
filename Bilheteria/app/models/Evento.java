package models;

import javax.persistence.Entity;//Importa a anotação Entity (que não sei pra quê serve)
import play.*; //Coloquei pra caso precise
import play.db.jpa.Model; //Classe modelo


@Entity
public class Evento extends Model {
	//Por enquanto só o nome
	private static int nEvento = 0;
	private String nome;
	public Evento(){
		setNome("Evento" + nEvento);
		nEvento++;
	}
	
	public Evento(String nome){
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}