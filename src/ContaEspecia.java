public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        double saldoTotal = getSaldo() + limite;
        if (valor > saldoTotal) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
        }
    }
}