package praticaProgramacao;
import java.util.ArrayList;

public class Pessoa {
	
	
	private String nomeP;
	private int cpf;
	private Animal objAnimal;
	private Animal umnome;
	
	Animal a = new Animal();
	
	public Pessoa() {
		this.umnome = new Animal();
	} //construtor default

	public Pessoa(String nomeP, int cpf, Animal objAnimal) { //construtor sobrecarregado
		this.nomeP = nomeP;
		this.cpf = cpf;
		this.objAnimal = objAnimal;
	}
	
	//metodos de acesso
	public String getNomeP() {
		return nomeP;
	}

	public int getCpf() {
		return cpf;
	}

	
	public String getAnimal() {
		return "\n    Animal\nNome: " + objAnimal.getNome()+ "\nCodigo: " + objAnimal.getCodigo() + "\nRaca: " + objAnimal.getRaca();
	} 
	
	
	
	private static ArrayList<Pessoa> pessoaLista = new ArrayList<>();
	//adicionar no arraylist
	static public void adicionar(Pessoa i) {
		pessoaLista.add(i);
	}
	
	public void imprimir() {
		for (int i = 0; i < pessoaLista.size();i++) {
			System.out.println("\n    Pessoa\nNome: " + pessoaLista.get(i).getNomeP() + "\nCPF: " + pessoaLista.get(i).getCpf() + pessoaLista.get(i).getAnimal());
		}
	}			
}
	