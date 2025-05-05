public abstract class Entrada { // abstract pq essa classe serve como modelo/base para outras classes

    protected int numeroDoAssento;

    public Entrada(int numeroDoAssento) {
        this.numeroDoAssento = numeroDoAssento;
    }

    public int getNumeroDoAssento() {
        return numeroDoAssento;
    }

    public abstract double calcularValor();

}
