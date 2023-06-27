package ex2;

public class Calculo {
	public double valorconverter;
	public double taxa_valor;
	public int tipo;
	public double converte(){
		if (tipo == 1){ 
			return valorconverter / taxa_valor;
		}else{
			return valorconverter * taxa_valor;
		}
 	}
 }
