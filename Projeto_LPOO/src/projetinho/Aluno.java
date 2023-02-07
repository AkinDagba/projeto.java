package projetinho;

public class Aluno extends Pessoa {

	private int matricula;
	
	public Aluno(String nome, String cpf, int matricula) 
	{
		super(nome, cpf);	
		this.setMatricula(matricula);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
