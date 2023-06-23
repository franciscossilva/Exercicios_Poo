public class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Novo saldo: " + saldo);
    }

    public void mostrarDados() {
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Saldo: " + saldo);
    }
}