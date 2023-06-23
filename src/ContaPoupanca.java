public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento) {
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
        System.out.println("Novo saldo após rendimento: " + getSaldo());
    }
}