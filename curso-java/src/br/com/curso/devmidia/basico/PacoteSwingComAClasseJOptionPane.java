package br.com.curso.devmidia.basico;

import javax.swing.JOptionPane;

public class PacoteSwingComAClasseJOptionPane {

	public static void main(String[] args) {

		//Entrada 
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		String sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobrenome: ");
		
		String aux = JOptionPane.showInputDialog(null, "Digite seu salario: ");
		
		double salario = Double.parseDouble(aux);
		
		aux = JOptionPane.showInputDialog(null, "Digite sua idade: ");
		int idade = Integer.parseInt(aux);
		
		//Processamento 
		String nomeCompleto = nome + "" + sobrenome;
		double result = salario * idade;
		
		//Saída 
		JOptionPane.showMessageDialog(null, nomeCompleto);
		JOptionPane.showMessageDialog(null, "Salário x idade: " + result);
	
	}

}
