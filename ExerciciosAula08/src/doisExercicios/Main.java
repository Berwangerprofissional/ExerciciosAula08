package doisExercicios;

// doisExercicios.Main.java
public class Main {
    public static void main(String[] args) {
        // Testando a classe doisExercicios.ContaBancaria
        System.out.println("----doisExercicios.ContaBancaria----");
        ContaBancaria conta = new ContaBancaria(12345, 500.0);

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo Inicial: " + conta.getSaldo());

        // Realizando um depósito
        conta.depositar(150.0);
        System.out.println("Saldo após depósito: " + conta.getSaldo());

        // Tentando sacar um valor maior que o saldo
        conta.sacar(700.0);

        // Sacando um valor válido
        conta.sacar(200.0);
        System.out.println("Saldo após saque: " + conta.getSaldo());

        System.out.println("\n----doisExercicios.outrosDoisExercicios.Carro----");
        // Testando a classe doisExercicios.outrosDoisExercicios.Carro
        Carro carro = new Carro("Honda Civic", 2022, "Preto");

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Cor Inicial: " + carro.getCor());

        // Acelerando o carro
        carro.acelerar();

        // Freando o carro
        carro.frear();

        // Mudando a cor do carro
        carro.mudarCor("Vermelho");
        System.out.println("Nova Cor: " + carro.getCor());

        // Tentando mudar para uma cor inválida
        carro.mudarCor("");
    }
}
