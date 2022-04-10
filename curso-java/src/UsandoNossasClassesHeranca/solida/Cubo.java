package UsandoNossasClassesHeranca.solida;

import UsandoNossasClassesHeranca.plana.Quadrilatero;

public class Cubo extends Quadrilatero {

    private int altura;
    
    public Cubo() {
        super();
        this.altura = 10;
    }
    
    public Cubo( int lado1, int lado2 ) {
        super( lado1, lado2 )  ;
        this.altura = 10;
    }
    
    public Cubo( int lado1, int lado2, int altura ) {
        super( lado1, lado2 ) ;
        this.altura = altura;        
    }
    
    
    public int getAltura() {
        return this.altura;
    }
    
    public void setAltura( int altura ) {
        this.altura = altura;
    }
    
    

}