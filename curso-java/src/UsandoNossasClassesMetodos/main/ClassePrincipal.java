package UsandoNossasClassesMetodos.main;



import javax.swing.JOptionPane;

import UsandoNossasClassesAbstract.plana.Quadrilatero;




public class ClassePrincipal {


    public static void main(String[] args) {
        
        
        
        //entrada
        int lado1 = Integer.parseInt( JOptionPane.showInputDialog( null, 
                "Digite o lado 1 do Quadrilatero 1" ) );

        int lado2 = Integer.parseInt( JOptionPane.showInputDialog( null, 
                "Digite o lado 2 do Quadrilatero 1" ) );        
        
        Quadrilatero quad1 = new Quadrilatero();
        quad1.setLado1( lado1 );
        quad1.setLado2( lado2 );
        
       
        Quadrilatero quad2 = new Quadrilatero();
        quad2.setLado1( 2 );
        quad2.setLado2( 4 );
        
        Quadrilatero quad3 = new Quadrilatero();
        
        Quadrilatero quad4 = new Quadrilatero(4, 5 );
        
        //processamento
        
        //saída
        System.out.println("Quadrilatero 1: " + quad1.getDadosFormatados() + " - " + quad1.getAreaPlana() );
        
        System.out.println("Quadrilatero 2: " + quad2.getDadosFormatados() + " - " + quad2.getPerimetroPlana());        
        
        System.out.println("Quadrilatero 3: " + quad3 + " - " + quad3.isQuadradoPlana());   
        
        System.out.println("Quadrilatero 4: " + quad4.toString()+ " - " + quad4.isRetanguloPlana() );        
        
    }
    
}
