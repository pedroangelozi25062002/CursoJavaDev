package br.com.curso.devmidia.basico;

import java.util.Scanner;

public class ComandosCondicionaisEmJava {
	
	public static void main(String[]UsandoIF) {

		//Entrada
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu consumo em KW: ");
		double valorKW = 0.75; 
		int consumoKW = entrada.nextInt();
		double valorPago = 0;
		
		//Processamento
		if(consumoKW >= 0) {
		valorPago = consumoKW * valorKW;
		} else {
			System.out.println("Valor consumdo não pode ser negativo");
			
		}
		
		
		//Saída
		System.out.println("Valor consumdo: R$" + valorPago);
		
}

}