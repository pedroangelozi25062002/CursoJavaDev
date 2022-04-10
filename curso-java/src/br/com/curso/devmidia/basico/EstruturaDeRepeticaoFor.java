package br.com.curso.devmidia.basico;

import java.util.Scanner;

public class EstruturaDeRepeticaoFor {

	public static void main(String[] args) {
		
		//Entrada
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero da tabuada: ");
		int num = entrada.nextInt();
		
		//Processamento e saída
		
		for (int i = 1; i <= 10; i++ ) {
			
			System.out.println(num + " x " + i + " = " + (i * num));
	
		}
		
	}

}
