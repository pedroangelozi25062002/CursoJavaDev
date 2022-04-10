
package UsandoNossasClassesAbstract.main;

import javax.swing.JOptionPane;

import UsandoNossasClassesAbstract.plana.FiguraPlana;
import UsandoNossasClassesAbstract.plana.Quadrilatero;
import UsandoNossasClassesAbstract.plana.Triangulo;
import UsandoNossasClassesAbstract.solida.Cubo;


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
        
        Cubo cub1 = new Cubo();
        cub1.setLado1( 100 );
        cub1.setLado2( 100 );
        cub1.setAltura( 100 );
        
        Cubo cub2 = new Cubo();
        
        Cubo cub3 = new Cubo( 20, 25 );
        
        Cubo cub4 = new Cubo( 100, 200, 300 );

        Triangulo t1 = new Triangulo();
        
        Triangulo t2 = new Triangulo( 10, 20, 25 );
        
        //processamento
        
        //saída
        System.out.println("Quadrilatero 1: " + quad1.getDadosFormatados() + " - " + quad1.getAreaPlana() );
        
        System.out.println("Quadrilatero 2: " + quad2.getDadosFormatados() + " - " + quad2.getPerimetroPlana());        
        
        System.out.println("Quadrilatero 3: " + quad3 + " - " + quad3.isQuadradoPlana());   
        
        System.out.println("Quadrilatero 4: " + quad4.toString()+ " - " + quad4.isRetanguloPlana() );        
        
        System.out.println("Cubo 1: " + cub1.toString()+ " - " + cub1.getAreaPlana() );        
        
        System.out.println("Cubo 2: " + cub2.toString()+ " - " + cub2.getPerimetroPlana() );        
        
        System.out.println("Cubo 3: " + cub3.toString()+ " - "+ cub3.getVolume() );  
        
        System.out.println("Cubo 4: " + cub4.toString()+ " - " + cub4.isCuboPerfeito() );  

        System.out.println("Triangulo 1: " + t1.toString()+ " - " + t1.getAreaPlana() );  
        
        System.out.println("Triangulo 2: " + t2.toString()+ " - " + t2.getPerimetroPlana() );  
        
    }
    
}
