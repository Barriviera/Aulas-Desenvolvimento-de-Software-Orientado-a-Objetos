package ex1;

public class Funcionario {
public String ra;
public String nome;
public double salario;
public boolean situ;

public void reajustar(double porc) {
salario = salario * porc;
	}
 public void demitir(boolean sit) {
 situ = sit;
 	}
 public void imprimir() {
 System.out.println("Matricula:" + ra);
 System.out.println("Nome:" + nome);
 System.out.println("Salario:" + salario);
 if (situ){
 System.out.println("Demitido");
 }else{
 System.out.println("Normal");
 		}
 	}
 }
