public class Teste {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Cliente 1", 1, 1000.0);
        ContaPoupanca conta2 = new ContaPoupanca("Cliente 2", 2, 2000.0, 15);
        ContaEspecial conta3 = new ContaEspecial("Cliente 3", 3, 3000.0, 1000.0);

        conta1.sacar(500.0);
        conta2.depositar(100.0);
        conta3.sacar(4000.0);

        conta2.calcularNovoSaldo(0.05);

        conta1.mostrarDados();
        conta2.mostrarDados();
        conta3.mostrarDados();
    }
}