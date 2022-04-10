package br.com.curso.devmidia.basico;

import java.util.Scanner;

public class EntradadeDadosECast {
	
	public static void main(String[]args) {
		
		Scanner entradadedados = new Scanner(System.in);
		
		System.out.println("Em qual ano você nasceu? "
				+ "Digite: ");
		int anoNascimento = entradadedados.nextInt();
		
		System.out.println("Em qual ano você esta atualmente? "
				+ "Digite: ");
		int anoAtual = entradadedados.nextInt();
		
		System.out.println("Qual o seu peso atualmente? "
				+ "Digite: ");
		double peso = entradadedados.nextDouble();
		
		System.out.println("Qual a sua altura atualmente? "
				+ "Digite: ");
		double altura = entradadedados.nextDouble();
		
		
		int idade = anoAtual - anoNascimento;
		int imc = (int) (peso / (altura * altura)); //Cast: "imc = (int)" é a converção de um tipo primitivo para outro.
		
 		System.out.println("Sua idade é de: " + idade);
 		System.out.println("Seu imc é de: " + imc);
		
	}

}
