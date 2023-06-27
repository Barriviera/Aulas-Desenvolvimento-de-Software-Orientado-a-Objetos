package ex4;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int cont;
		for (cont = 1; cont<4; cont++) {
			Aluno a = new Aluno();
			double n1 = Double.parseDouble(JOptionPane.showInputDialog("Aluno " + cont +"   nota 1:"));
			double n2 = Double.parseDouble(JOptionPane.showInputDialog("Aluno " + cont +"   nota 2:"));
			double n3 = Double.parseDouble(JOptionPane.showInputDialog("Aluno " + cont +"   nota 3:"));
			a.n1 = n1;
			a.n2 = n2;
			a.n3 = n3;
			a.calcNota();
			System.out.println("Aluno " + cont);
			a.resultado();
		}
	}
}
