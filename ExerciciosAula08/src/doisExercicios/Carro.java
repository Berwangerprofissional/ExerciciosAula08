package doisExercicios;

public class Carro {
    private String modelo; // Atributo encapsulado
    private int ano; // Atributo encapsulado
    private String cor; // Atributo encapsulado

    // Construtor
    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    //acelerar
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    //frear
    public void frear() {
        System.out.println("O carro está freando.");
    }

    //mudar a cor do carro
    public void mudarCor(String novaCor) {
        if (novaCor != null && !novaCor.isEmpty()) {
            this.cor = novaCor;
            System.out.println("A cor do carro foi alterada para " + novaCor + ".");
        } else {
            System.out.println("Cor inválida.");
        }
    }

    //getters
    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }
}
