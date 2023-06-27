package praticaProgramacao;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		int menu = 0;
		Pessoa objPessoa;
		Animal objAnimal;
		String nomeP;
		int cpf;
		
		String nome, raca;
		int codigo;
		
		
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("============= Menu =============\n"
					+ "1 - Cadastrar pessoas e animais\n"
					+ "2 - Listar dados\n"
					+ "3 - Sair\n"
					+ "================================\n\n");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("Insira o nome da pessoa: ");
				nomeP = sc.next();
				System.out.println("Insira o CPF da pessoa: ");
				cpf = sc.nextInt();
				System.out.println("Insira o nome do animal: ");
				nome = sc.next();
				System.out.println("Insira o codigo do animal: ");
				codigo = sc.nextInt();
				System.out.println("Insira a raça do Animal: ");
				raca = sc.next();
				
				objAnimal = new Animal(codigo, nome, raca);
				objPessoa = new Pessoa(nomeP, cpf, objAnimal);
				
				Pessoa.adicionar(objPessoa);
				
				break;
			case 2:
				Pessoa p = new Pessoa();
				p.imprimir();
			
				break;
			case 3:
				
				break;
			default:
				System.out.println("Opção invalida!");
			}
			
			
		}while (menu != 3);
		
		}
	
}