
package modelo;


public abstract class Poligono {
    private int numeroLados; 

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    
    // definir metodos abstractos para luego ser implementados en clases hijas 
    
    public abstract double area();
    public abstract double perimetro(); 
    
}
