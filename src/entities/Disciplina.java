package entities;

public class Disciplina {
    private String disciplina;
    private String gabaritooficial;
    
    public Disciplina() {
    }

	public Disciplina(String disciplina,String gabaritooficial) {
		this.disciplina = disciplina;
		this.gabaritooficial = gabaritooficial;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
	public String getGabaritooficial() {
		return gabaritooficial;
	}


	public String toString() {
		return disciplina;
	}
	
	
      
      
}
