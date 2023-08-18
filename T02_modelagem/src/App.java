import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Baralho baralho = new Baralho();
        baralho.embaralha();

        Deck jog1 = new Deck();
        Deck jog2 = new Deck();
        Deck empates = new Deck();

        while (!baralho.vazio()) {
            jog1.poeCarta(baralho.tiraCarta());
            jog2.poeCarta(baralho.tiraCarta());
        }

        System.out.println("Digite o nome do jogador 1: ");
        String joga1 = sc.nextLine();
        System.out.println("\nDigite o nome do jogador 2: ");
        String joga2 = sc.nextLine();

        boolean acabou = false;
        int rodada = 1;
        while (!acabou) {
            Carta carta1 = jog1.tiraCarta();
            System.out.println("\njog 1: " + carta1);
            Carta carta2 = jog2.tiraCarta();
            System.out.println("jog 2: " + carta2);
            empates.poeCarta(carta1);
            empates.poeCarta(carta2);
            System.out.println("Rodada: " + rodada);
            rodada++;

            if (carta1.maior(carta2)) {
                jog1.poeDeck(empates);
                System.out.println(
                        "Jogador 1 ganhou a rodada.");
            } else if (carta2.maior(carta1)) {
                jog2.poeDeck(empates);
                System.out.println(
                        "Jogador 2 ganhou a rodada.");
            }
            System.out.println("Jog1: " + jog1.qntCartas() + "\njog2: " + jog2.qntCartas());

            if (jog1.vazio()) {
                System.out.println("\n" + joga2 + " venceu\nFim");
                acabou = true;
            } else if (jog2.vazio()) {
                System.out.println("\n" + joga1 + " venceu\nFim");
                acabou = true;
            }
        }
        sc.close();
    }
}