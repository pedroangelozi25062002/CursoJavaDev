package UsandoNossasClassesAtributos.main;

import UsandoNossasClassesAbstract.plana.Quadrilatero;

public class ClassePrincipal {


    public static void main(String[] args) {
        //entrada
        Quadrilatero quad1 = new Quadrilatero();
        quad1.lado1 = 2;
        quad1.lado2 = 2;
        
        
        Quadrilatero quad2 = new Quadrilatero();
        quad2.lado1 = 2;
        quad2.lado2 = 4;        
        
        //processamento
        
        //saída
        System.out.println("Quadrilatero 1: " + quad1.lado1 + " - " + 
                quad1.lado2 );
        
        System.out.println("Quadrilatero 2: " + quad2.lado1 + " - " + 
                quad2.lado2 );        
    }
    
}
