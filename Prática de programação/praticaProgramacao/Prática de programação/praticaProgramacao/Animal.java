package praticaProgramacao;
import java.util.ArrayList;

public class Animal {

	private int codigo;
	private String nome;
	private String raca;
	
	public Animal() {}
	public Animal(int codigo, String nome, String raca) {
		this.codigo = codigo;
		this.nome = nome;
		this.raca = raca;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getRaca() {
		return raca;
	}

	
	private static ArrayList<Animal> AnimalLista = new ArrayList<>();
	//adicionar no arraylist
		static public void adicionar(Animal i) {
			AnimalLista.add(i);
		}
	
}
