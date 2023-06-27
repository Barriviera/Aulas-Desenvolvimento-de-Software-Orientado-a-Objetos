package ex1;

import javax.swing.JOptionPane;

 public class Calculo {

 Funcionario f = new Funcionario();

 public void processa() {
 executa();
 }

 public void opcao_registrar() {
 f.nome = JOptionPane.showInputDialog("nome ");
 f.situ = Boolean.parseBoolean(JOptionPane.showInputDialog("situ "));
 f.salario = Double.parseDouble(JOptionPane.showInputDialog("salário"));
 	}

 public void opcao_mostrar() {
 JOptionPane.showMessageDialog(null, f.nome + " - situacao:" + f.situ + "-salario:" + f.salario);
 	}

 public void opcao_reajustar() {
 f.reajustar(Double.parseDouble(JOptionPane.showInputDialog("digite a porcentagem do acrecimo")));
 	}

 public void executa() {
 int x = 0;
 do {
 x = Integer.parseInt(JOptionPane.showInputDialog("1 - Add funcionario \n2 - mostrar funcionario\n3 - reajustar salario \n4 - sair"));
 if (!((x > 0) && (x <5))) {
 System.out.println("numero invalido");
 }else {
 switch (x) {
 case 1:
 opcao_registrar();
 break;
 case 2:
 opcao_mostrar();
 break;
 case 3:
 opcao_reajustar();
 break;
 				}
 			}
 		}while(x != 4);
 	}
 }
