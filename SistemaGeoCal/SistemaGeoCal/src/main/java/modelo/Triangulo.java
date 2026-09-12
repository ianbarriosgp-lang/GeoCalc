
package modelo;

public class Triangulo extends Poligono {
    private double lado1;
    private double lado2;
    private double lado3;

    //metodo constructor

    public Triangulo(double lado1, double lado2, double lado3, int numeroLados) {
        super(numeroLados);
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
        if (!esTrianguloValido()) {
            throw new IllegalArgumentException(
                    "Los valores ingresados no forman un triangulo valido.");
        }
    }

    private boolean esTrianguloValido() {
        return (lado1 + lado2 > lado3)
                && (lado1 + lado3 > lado2)
                && (lado2 + lado3 > lado1);
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        if (lado1 <= 0) {
            throw new IllegalArgumentException("El lado A debe ser mayor que 0.");
        }
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        if (lado2 <= 0) {
            throw new IllegalArgumentException("El lado B debe ser mayor que 0.");
        }
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        if (lado3 <= 0) {
            throw new IllegalArgumentException("El lado C debe ser mayor que 0.");
        }
        this.lado3 = lado3;
    }

    //implementar los metodos para calcular area y perimetro

    @Override
    public double area() {
        // formula de Heron
        double s = perimetro() / 2.0;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

}
