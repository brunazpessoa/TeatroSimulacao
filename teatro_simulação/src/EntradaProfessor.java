public class EntradaProfessor extends Entrada {
    double preco = 0; // preco será definido a partir do valor do espetaculo escolhido

    public EntradaProfessor(int numeroDoAssento) {
        super(numeroDoAssento);
    }

    @Override
    public double calcularValor() {
        return preco * 0.4; // 40% de desconto do valor cheio
    }
}
