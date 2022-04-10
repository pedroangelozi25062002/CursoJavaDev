package br.com.curso.devmidia.basico;

import java.util.Scanner;

public class OperadoresLogicosEmCondicionaisESwitchEmJava {

	public static void main(String[]UsandoIF) {

		//Entrada
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu consumo em KW: ");
		double valorKW = 0.72; 
		int consumoKW = entrada.nextInt();
		double valorPago = 0;
		
		// < 10 = 0.50
		//>= 10 e < 100 = 0.72
		//>= 100 = 1.00
		
		// OPERADORES LÓGICOS
		// ! = negação 
		// && = e lógico
		// || = ou lógico
		
		//Processamento
		if(consumoKW == 0) {
			System.out.println("Você não consumiu energia este mês");
		} else if(consumoKW < 0 || consumoKW > 1000){
			System.out.println("Erro! Valor consumdo não pode ser negativo e não pode ser maior q 1000");
		} else if(consumoKW > 0 && consumoKW < 10) {
			valorPago = consumoKW * 0.5;
		} else if (consumoKW >= 10 && consumoKW < 100) {
			valorPago = consumoKW * 0.72;
		} else if (consumoKW >= 100) {
			valorPago = consumoKW * 1;
		}
		
		
		//Saída
		System.out.println("Valor consumdo: R$" + valorPago);
		
}
	
}
