package projetinho;

public class Professor extends Pessoa {

	private String registro;
	
	public Professor(String nome, String cpf, String registro) 
	{
		super(nome, cpf);
		
		this.setRegistro(registro);
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	
}
