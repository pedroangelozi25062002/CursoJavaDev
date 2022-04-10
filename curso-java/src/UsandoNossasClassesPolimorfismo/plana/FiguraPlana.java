package UsandoNossasClassesPolimorfismo.plana;

public abstract class FiguraPlana implements FiguraPlanaInterface {
    
    private int lado1;
    private int lado2;


    public FiguraPlana() {
        lado1 = 10;
        lado2 = 10;
    }

    public FiguraPlana(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }    
    
    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    
    public String getDadosFormatados() {
        return lado1 + " - " + lado2;
    }
    
    @Override
    public String toString() {
        return getDadosFormatados();
    }

    
}