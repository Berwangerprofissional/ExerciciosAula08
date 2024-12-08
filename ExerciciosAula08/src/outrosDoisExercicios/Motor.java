package outrosDoisExercicios;

public class Motor {
    private String modelo;
    private int potencia; // em cavalos
    private String tipoCombustivel; // GASOLINA, DIESEL, ELETRICO
    private int cilindradas;
    private boolean ligado;
    private int rpm;

    // Construtor
    public Motor(String modelo, int potencia, String tipoCombustivel, int cilindradas) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.cilindradas = cilindradas;
        this.ligado = false;
        this.rpm = 0;
    }

    public void ligar() {
        ligado = true;
        rpm = 1000; // RPM inicial
        System.out.println("outrosDoisExercicios.Motor ligado.");
    }

    public void desligar() {
        ligado = false;
        rpm = 0; // RPM zerado
        System.out.println("outrosDoisExercicios.Motor desligado.");
    }

    public void aumentarPotencia(int incremento) {
        potencia += incremento;
        System.out.println("Potência aumentada para " + potencia + " cavalos.");
    }

    public void reduzirPotencia(int decremento) {
        potencia -= decremento;
        System.out.println("Potência reduzida para " + potencia + " cavalos.");
    }

    public void acelerar(int incrementoRpm) {
        if (ligado) {
            rpm += incrementoRpm;
            System.out.println("RPM aumentado para " + rpm + ".");
        } else {
            System.out.println("outrosDoisExercicios.Motor está desligado. Não é possível acelerar.");
        }
    }

    public void reduzirRpm(int decrementoRpm) {
        if (ligado) {
            if (decrementoRpm <= rpm) {
                rpm -= decrementoRpm;
                System.out.println("RPM reduzido para " + rpm + ".");
            } else {
                System.out.println("O decremento é maior que o RPM atual.");
            }
        } else {
            System.out.println("outrosDoisExercicios.Motor está desligado. Não é possível reduzir RPM.");
        }
    }

    @Override
    public String toString() {
        return "outrosDoisExercicios.Motor: " + modelo + ", Tipo de Combustível: " + tipoCombustivel + ", Potência: " + potencia + " cv";
    }
}