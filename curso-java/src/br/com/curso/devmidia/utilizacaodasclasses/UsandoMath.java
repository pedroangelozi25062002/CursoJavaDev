package br.com.curso.devmidia.utilizacaodasclasses;


import javax.swing.JOptionPane;

public class UsandoMath {

public static void main(String[] args) {
        
        double result = Math.sqrt( 81);
        double aux = Math.pow( 9, 2 );
        
        double cat1 = Double.parseDouble( 
                JOptionPane.showInputDialog( null, "Digite o cat1" ) );
        
        double cat2 = Double.parseDouble( 
                JOptionPane.showInputDialog( null, "Digite o cat2" ) ); 
        
        double cat3 = Double.parseDouble( 
                JOptionPane.showInputDialog( null, "Digite o cat3" ) );         
        
        double hypot = Math.hypot( cat1, cat2 );
        
        System.out.println("Hypot: " + hypot );
        
        double maximo = Math.max( cat1, Math.max( cat2, cat3 ) );
        System.out.println( maximo );
        
        for (int i = 0; i < 10; i++) {
            
            double random = (int) (Math.random() * 10);
            System.out.println("Número aleatório " + i + "=" + random );
        
        }
        
    }
}