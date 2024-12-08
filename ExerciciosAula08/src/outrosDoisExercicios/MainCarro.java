package outrosDoisExercicios;

public class MainCarro {
    public static void main(String[] args) {
        // Criando motores
        Motor motor1 = new Motor("V8", 450, "GASOLINA", 5000);
        Motor motor2 = new Motor("V6", 350, "DIESEL", 3000);
        Motor motor3 = new Motor("Elétrico", 700, "ELETRICO", 0);

        // Criando carros
        Carro carro1 = new Carro("Mustang", motor1);
        Carro carro2 = new Carro("F-150", motor2);
        Carro carro3 = new Carro("Tesla Model S", motor3);

        // Testando os carros
        System.out.println(carro1);
        carro1.ligarCarro();
        carro1.acionarAcelerador(2000);
        carro1.turboBoost();
        carro1.acionarFreio(1000);
        carro1.desligarCarro();

        System.out.println();

        System.out.println(carro2);
        carro2.ligarCarro();
        carro2.acionarFreio(500);

        System.out.println();

        System.out.println(carro3);
        carro3.ligarCarro();
        carro3.acionarAcelerador(1500);
    }
}
