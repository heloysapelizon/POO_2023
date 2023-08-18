import java.util.*;

public class App {
    public static void main(String args[]) {
        Placa p1 = new Placa("Brasil", "ABC1R23");
        Placa p2 = new Placa("Argentina", "JKN5R91");
        Placa p3 = new Placa("Paraguai", "AOD4P08");
        Placa p4 = new Placa("Uruguai", "MSA3L65");
        Placa p5 = new Placa("Venezuela", "TRY9L45");

        Veiculo[] carros = new Veiculo[5];

        carros[0] = new Veiculo(p1);
        carros[1] = new Veiculo(p2);
        carros[2] = new Veiculo(p3);
        carros[3] = new Veiculo(p4);
        carros[4] = new Veiculo(p5);

        Scanner sc = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 3) {
            escolha = menuEscolha();
            try {
                switch (escolha) {
                    case 1:
                        Veiculo carro = carros[achaVeiculo(carros)];
                        System.out.println("\ndigite o n de litros que deseja abastecer");
                        double litros = sc.nextDouble();
                        carro.abastece(litros);
                        System.out.println("\nDados do veiculo depois de abastecer:\n" + carro);
                        break;
                    case 2:
                        carro = carros[achaVeiculo(carros)];
                        System.out.println("digite o n de quilometros que deseja andar");
                        double km = sc.nextDouble();
                        carro.dirige(km);
                        System.out.println("\nDados do veiculo depois de andar " + km + "km:\n" + carro);
                        break;
                    case 3:
                        for (int i = 0; i < carros.length; i++) {
                            System.out.println(carros[i] + "\n");
                        }
                }
            } catch (Exception e) {
                System.out.println("Veiculo não encontrado");
                escolha = 4;
            }
        }
    }

    public static int menuEscolha() {
        System.out.println("\nMenu: \n(1) Abastecer\n(2) Dirigir\n(3) Fim");
        Scanner sc = new Scanner(System.in);
        int escolha = sc.nextInt();
        return escolha;
    }

    public static int achaVeiculo(Veiculo[] carros) { // acha o index do veiculo
        System.out.println("digite a placa do carro");
        Scanner sc = new Scanner(System.in);
        String placa = sc.nextLine();
        int cont = -1;
        for (int i = 0; i < carros.length; i++) {
            if (placa.equals((carros[i].getPlaca()).getCodigo())) {
                cont = i;
                break;
            }
        }
        return cont;
    }
}
/**
Escreva um novo código para o método "main": crie uma instancia da classe "Placa" e 
informe a esta mesma placa para duas instancias de "Veiculo". Exiba na tela as informações de cada veículo a partir do método 
"toString". Em seguida, usando o método "setPais" da classe "Veiculo", altere o país do segundo veículo e imprima
novamente as informações dos dois veículos. Explique: por que as informações de ambos os veículos foram alteradas?

Porque a instancia que atribui a placa para os veiculos é so um redirecionamento parao mesmo objeto de placa, que quando alterado
pelo método de um veiculo modifica o objeto original
 */