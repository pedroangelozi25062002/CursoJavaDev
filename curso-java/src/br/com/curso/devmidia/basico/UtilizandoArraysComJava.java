package br.com.curso.devmidia.basico;

import javax.swing.JOptionPane;

public class UtilizandoArraysComJava {

	public static void main(String[] args) {

		//Entrada
		int idade[] = new int[10];
		
		for(int i = 0; i < idade.length; i++ ){
			idade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade: "));
		}
			
		//Processamento 
		int somaIdade = 0;
		
		for(int i = 0; i < idade.length; i++) {
			somaIdade = somaIdade + idade[i];
		}
		
		double media = (somaIdade) / (double) idade.length;
		
		//Saída
		System.out.println("Media: " + media);
	}

}
