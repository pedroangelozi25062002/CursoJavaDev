package br.com.curso.devmidia.utilizacaodasclasses;

import javax.swing.JOptionPane;

public class UsandoModeloOO {
	 public static void main(String[] args) {

//       //entrada
//       String texto = JOptionPane.showInputDialog( null, "Digite um texto" );
//       String saida = "";
//       
//       
//       //processamento
//       saida = texto.toUpperCase();
//       
//       
//       //saída
//       JOptionPane.showMessageDialog( null, "Resposta: " + saida );
       
       
       //entrada
       String data = JOptionPane.showInputDialog( 
               null,  "Digite uma data (dd/mm/aaaa)" );
       
       String meses[] = { "janeiro",  "fevereiro", "março",
           "abril","maio","junho","julho","agosto","setembro",
           "outubro","novembro","dezembro"
       };
       
       //processamento
       String parte[] = data.split( "/" );
       int mes = Integer.parseInt( parte[1] );
       String mesExtenso = meses[ mes - 1 ];
       
       //saída
       JOptionPane.showMessageDialog( null, parte[0] + " de " + 
               mesExtenso + " de " + parte[2] );
                
   }
}

