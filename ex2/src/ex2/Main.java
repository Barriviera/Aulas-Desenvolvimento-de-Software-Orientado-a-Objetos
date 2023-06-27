package ex2;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		double valoraconverter = 0;
		double taxa_valor = 0;
		valoraconverter = Double.parseDouble(JOptionPane.showInputDialog("valor a converter"));
		taxa_valor = Double.parseDouble(JOptionPane.showInputDialog("cotação euro"));
		if (taxa_valor == 0) {
			JOptionPane.showMessageDialog(null, "valor do euro inválido");

			return;
		}else {
			Calculo c = new Calculo();
			c.valorconverter = valoraconverter;
			c.taxa_valor = taxa_valor;
			JOptionPane.showMessageDialog(null, c.converte() );
 		}
 	}

 }
