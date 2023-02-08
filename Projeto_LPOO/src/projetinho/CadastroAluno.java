package projetinho;
import java.util.Scanner;

public class CadastroAluno{
	
	public static void main(String[] Args) 
	{
		Scanner teclado =  new Scanner(System.in);
		Aluno aluno1 = new Aluno(null, null, null);
		
		
		System.out.println("Digite o nome do aluno: ");
		aluno1.setNome(teclado.nextLine());
		System.out.println("Digite o CPF do aluno: ");
		aluno1.setCpf(teclado.nextLine());
		System.out.println("Digite o Matricula do aluno: ");
		aluno1.setMatricula(teclado.nextLine());
		
		
	}
}
