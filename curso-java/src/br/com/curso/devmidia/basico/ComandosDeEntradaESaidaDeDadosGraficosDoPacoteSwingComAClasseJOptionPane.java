package br.com.curso.devmidia.basico;

import javax.swing.JOptionPane;

public class ComandosDeEntradaESaidaDeDadosGraficosDoPacoteSwingComAClasseJOptionPane {

	public static void main(String[]args) {
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		String sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobrenome: ");
		String aux = JOptionPane.showInputDialog(null, "Digite seu salario: ");
		
		double salario = Double.parseDouble(aux);
		
		aux = JOptionPane.showInputDialog(null, "Digite sua idade: ");
		int idade = Integer.parseInt(aux);
 
		
		
		String nomeCompleto = nome + sobrenome;
		double result = salario * idade; 

		JOptionPane.showMessageDialog(null, nomeCompleto);
		JOptionPane.showMessageDialog(null, "Salario x idade: " + result);
		
	}
}
