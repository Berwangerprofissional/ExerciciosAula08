package doisExercicios;

public class ContaBancaria {
    private double saldo; // Atributo encapsulado
    private int numeroConta; // Atributo encapsulado

    // Construtor
    public ContaBancaria(int numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    //depositar valores
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    //sacar valores
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    //exibir o saldo atual
    public double getSaldo() {
        return saldo;
    }

    //obter o número da conta
    public int getNumeroConta() {
        return numeroConta;
    }
}