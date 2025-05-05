public class EntradaMeia extends Entrada {
    double preco = 0; // preco será definido a partir do valor do espetaculo escolhido

    public EntradaMeia(int numeroDoAssento) {
        super(numeroDoAssento);
    }

    @Override //
    public double calcularValor() {
        return preco * 0.5; // 50% do valor da entrada
    }

}
