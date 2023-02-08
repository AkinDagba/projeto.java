package projetinho;

public class Professor extends Pessoa {

	private String siape;
	
	public Professor(String nome, String cpf, String siape) 
	{
		super(nome, cpf);
		
		this.setSiape(siape, siape);
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String Siape, String siape) {
		this.siape = siape;
	}

	
}
