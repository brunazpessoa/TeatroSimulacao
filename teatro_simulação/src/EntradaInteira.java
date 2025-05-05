public class EntradaInteira extends Entrada {
    double preco = 0; // preco será definido a partir do valor do espetaculo escolhido

    public EntradaInteira(int numeroDoAssento) {
        super(numeroDoAssento); // super se refere a um elemento da classe pai (Entrada)
    }

    @Override // implementando uma nova versão de um método da classe Entrada
    public double calcularValor() {
        return preco; // pois é o valor cheio
    }
}
