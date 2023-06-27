package ex3;

import javax.swing.JOptionPane;

public class Calculo {
	public double x;
	public double y;
	public char op;
	public double resultado;

	public void exibirResultado(){
		JOptionPane.showMessageDialog(null, this.resultado);
	}

	public void calcular(){
		switch (op){
		case '+':
			this.add();
			break;
		case '-':
			this.sub();
			break;
		case '*':
			this.multi();
			break;
		case '/':
			this.divi();
			break;
		default:
			JOptionPane.showMessageDialog(null,"Simbolo Invalido.");
			break;
		}
		
 }

	public void add(){
		this.resultado = this.x + this.y;
		this.exibirResultado();
	}
	public void sub() {
		this.resultado = this.x - this.y;
		this.exibirResultado();
	}
	public void multi(){
		this.resultado = this.x * this.y;
		this.exibirResultado();
	}
	public void divi(){
		if (!(this.y ==0)) {
			this.resultado = this.x / this.y;
			this.exibirResultado();
		}else{
			JOptionPane.showMessageDialog(null, "divisao invalida");
 		}
 	}
}
