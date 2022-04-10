package br.com.curso.devmidia.basico;

public class OperadoresMatematicoseRelacionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//entrada
		int num1 = 10; 
		int num2 = 2;
		int imc = 24;
		
		
		//Processamento
		//Operações Matematicas
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 / num2;
		int result4 = num1 * num2;
		//Dados relacional
		boolean abaixoPeso = imc < 25;

		
		//saída
		System.out.println("Resultado da operação de +: " + result1);

		System.out.println("Resultado da operação de -: " + result2);

		System.out.println("Resultado da operação de /: " + result3);
	
		System.out.println("Resultado da operação de *: " + result4);
	
		System.out.println("Resultado da operação boolean: É magro " + abaixoPeso);

	}

	
}
