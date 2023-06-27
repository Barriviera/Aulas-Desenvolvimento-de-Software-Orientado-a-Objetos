package ex3;

import javax.swing.JOptionPane;

public class Main {

 public static void main(String[] args) {

	 double x = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de x"));
	 double y = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de y"));
	 char op = JOptionPane.showInputDialog(" escolha um operador \n  +   -   /   *").charAt(0);

	 Calculo c = new Calculo();
	 c.x = x;
	 c.y = y;
	 c.op = op;
	 c.calcular();


 	}

 }

