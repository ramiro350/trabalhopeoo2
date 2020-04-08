package entities;

public class Aluno {
   
     private String gabarito;
     private String nome;
     
     public Aluno() {
    	 
     }
     
	public Aluno(String gabarito, String nome) {
		this.gabarito = gabarito;
		this.nome = nome;
	}


	public String getGabarito() {
		return gabarito;
	}
	
	public void setGabarito() {
		this.gabarito = gabarito;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
     
}
