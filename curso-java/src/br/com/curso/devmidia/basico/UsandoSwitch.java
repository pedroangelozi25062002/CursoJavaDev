package br.com.curso.devmidia.basico;

import java.util.Scanner;

public class UsandoSwitch {

	public static void main(String[] args) {

		//Entrada
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero de 0 á 9: ");
		int num1 = entrada.nextInt();
		
		String numeroExtenso = "";
		
		
		//Processamento
		switch(num1) {
			
		case 0 :
			numeroExtenso = "Zero";
			break;
			
		case 1 :
			numeroExtenso = "Um";
			break;
			
		case 2 :
			numeroExtenso = "Dois";
			break;
			
		case 3 :
			numeroExtenso = "Três";
			break;
			
		case 4 :
			numeroExtenso = "Quatro";
			break;
			
		case 5 :
			numeroExtenso = "Cinco";
			break;
			
		case 6 :
			numeroExtenso = "Seis";
			break;
			
		case 7 :
			numeroExtenso = "Sete";
			break;
		
		case 8 :
			numeroExtenso = "Oito";
			break;
		
		case 9 :
			numeroExtenso = "Nove";
			break;
		
		default : 
			numeroExtenso = "Valor não suportado";
			break;
		}
		
		//Saída
		System.out.println(numeroExtenso);
	}

}
