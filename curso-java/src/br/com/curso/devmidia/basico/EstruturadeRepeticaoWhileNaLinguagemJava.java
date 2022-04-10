package br.com.curso.devmidia.basico;

import java.util.Scanner;

public class EstruturadeRepeticaoWhileNaLinguagemJava {

	public static void main(String[]UsandoWhile) {

		//Entrada
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite 1 para sair");
		int condicao = entrada.nextInt();
	
		//Processamento e Saida
		do {
			
			System.out.println("Você digitou o numero: " + condicao);
			
			System.out.println("Digite 1 para sair");
			condicao = entrada.nextInt();
			
		} while (condicao != 1);
		
		System.out.println("Até logo");
		
			
	}
}