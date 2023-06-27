package ex4;

public class Aluno {
	
	public double n1, n2, n3, media;
	public void calcNota(){
		this.media = (this.n1 + this.n2 + this.n3) / 3;
	}

	public void resultado(){
		System.out.println("Media: " + media);
		if (this.media < 6){
			System.out.println("Reprovado");
		}else{
			System.out.println("Aprovado!");
		}
	}
}
