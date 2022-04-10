package UsandoNossasClassesJavadoc.plana;

/**
 * Classe responsável pelo armazenamento de informacoes de uma figura plana com quatro lados
 * 
 * 
 * @author Robison Cris
 * @version 2.0
 */
public class Quadrilatero {
    
    private int lado1;
    private int lado2;
    
    
    /**
     * Método construtor sem parâmetros responsavel por valorizar os atributos lado1 e lado2 do quadrilátero com 10.
     * 
     */
    public Quadrilatero() {
        this.lado1 = 10;
        this.lado2 = 10;
    }
    
    /**
     * Método construtor com parâmetros que define valores iniciais para os atributos lado1 e lado2
     * @param l1 Valor correspondente ao lado1 do quadrilátero
     * @param l2 Valor correspondente ao lado2 do quadrilátero
     */
    public Quadrilatero( int l1, int l2 ) {
        this.lado1 = l1;
        this.lado2 = l2;
    }
    
    /**
     * Método que retorna o valor armazenado do lado 1
     * @return Valor armazenado no lado 1
     */
    public int getLado1() {
        return this.lado1;
    }
    
    /**
     * Método que retorna o valor armazenado do lado 2
     * @return Valor armazenado no lado 2
     */    
    public int getLado2() {
        return this.lado2;
    }
    
    /**
     * Método que fornece um valor para o lado 1. Caso o valor for negativo, o valor zero será atribuído ao lado
     * @param l1 Valor para o Lado 1
     */
    public void setLado1( int l1 ) {
        if ( l1 > 0 ) {
            this.lado1 = l1;
        } else {
            this.lado1 = 0;
        }
    }

    /**
     * Método que fornece um valor para o lado 2. Caso o valor for negativo, o valor zero será atribuído ao lado
     * @param l2 Valor para o Lado 2
     */    
    public void setLado2( int l2 ) {
        if ( l2 > 0 ) {
            this.lado2 = l2;
        } else {
            this.lado2 = 0;
        }
    }

    /**
     * Retorna uma representação textual para o objeto quadrilatero, sendo este formado pelo lado1 - Lado2
     * @return Representação textual
     */
    public String getDadosFormatados() {
        return this.lado1 + " - " + this.lado2;
    }
    
    /**
     * Retorna uma representação textual para o objeto quadrilatero, sendo este formado pelo lado1 - Lado2
     * @return Representação textual
     */
    public String toString() {
       return this.getDadosFormatados(); 
    }

    /**
     * Retorna a área do quadrilátero (lado1 x lado2)
     * @return Área do quadrilátero
     */
    public double getAreaPlana() {
        return this.lado1 * this.lado2 ;
    }

    /**
     * Retorna o perímetro do quadrilátero (soma dos lados)
     * @return Perímetro do quadrilátero
     */    
    public double getPerimetroPlana() {
        return (2 * this.lado1) + (2 * this.lado2);
    }
    
    /**
     * Verifica se o quadrilátero é um quadrado (lados iguais), retornando true caso verdadeiro
     * @return Verdadeiro se for quadrado
     */    
    public boolean isQuadradoPlana() {
        if ( this.lado1 == this.lado2 ) {
            return true;
        } else {
            return false;
        } 
    }

    /**
     * Verifica se o quadrilátero é um retângulo (lados diferentes), retornando true caso verdadeiro
     * @return Verdadeiro se for retangulo
     */    
    
    public boolean isRetanguloPlana() {
        return ! this.isQuadradoPlana();        
    }
}
