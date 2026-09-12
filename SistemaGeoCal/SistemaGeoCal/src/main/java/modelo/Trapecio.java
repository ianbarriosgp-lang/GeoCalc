
package modelo;

public class Trapecio extends Poligono {
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double ladoIzquierdo;
    private double ladoDerecho;

    //metodo constructor
    

    public Trapecio(double baseMayor, double baseMenor, double altura,
            double ladoIzquierdo, double ladoDerecho, int numeroLados) {
        super(numeroLados);
        setBaseMayor(baseMayor);
        setBaseMenor(baseMenor);
        setAltura(altura);
        setLadoIzquierdo(ladoIzquierdo);
        setLadoDerecho(ladoDerecho);
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        if (baseMayor <= 0) {
            throw new IllegalArgumentException("La base mayor debe ser mayor que 0.");
        }
        this.baseMayor = baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        if (baseMenor <= 0) {
            throw new IllegalArgumentException("La base menor debe ser mayor que 0.");
        }
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que 0.");
        }
        this.altura = altura;
    }

    public double getLadoIzquierdo() {
        return ladoIzquierdo;
    }

    public void setLadoIzquierdo(double ladoIzquierdo) {
        if (ladoIzquierdo <= 0) {
            throw new IllegalArgumentException("El lado izquierdo debe ser mayor que 0.");
        }
        this.ladoIzquierdo = ladoIzquierdo;
    }

    public double getLadoDerecho() {
        return ladoDerecho;
    }

    public void setLadoDerecho(double ladoDerecho) {
        if (ladoDerecho <= 0) {
            throw new IllegalArgumentException("El lado derecho debe ser mayor que 0.");
        }
        this.ladoDerecho = ladoDerecho;
    }

    //implementar los metodos para calcular area y perimetro

    @Override
    public double area() {
        return ((baseMayor + baseMenor) * altura) / 2.0;
    }

    @Override
    public double perimetro() {
        return baseMayor + baseMenor + ladoIzquierdo + ladoDerecho;
    }

}
