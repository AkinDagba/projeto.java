package projetinho;

public class Aluno extends Pessoa {

	private String matricula;
	private String curso;
	private String anoDeEntrada;
	
	public Aluno(String nome, String cpf, String matricula, String curso, String anoDeEntrada) 
	{
		super(nome, cpf);	
		this.setMatricula(matricula);
		this.setCurso(curso);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getAnoDeEntrada() {
		return anoDeEntrada;
	}

	public void setAnoDeEntrada(String anoDeEntrada) {
		this.anoDeEntrada = anoDeEntrada;
	}

}
