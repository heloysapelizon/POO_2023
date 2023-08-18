import java.util.*;

public class Deck {
    private Random rand;
    private Carta[] cartas;
    public final int size = 104;
    private int proxLivre;

    public Deck() {
        cartas = new Carta[size];
        proxLivre = 0;
        rand = new Random();
    }

    public int qntCartas() {
        return proxLivre;
    }

    public Carta tiraCarta() { // retira a carta de cima
        if (proxLivre != 0) {
            Carta deCima = cartas[0];
            for (int i = 0; i < proxLivre - 1; i++) {
                cartas[i] = cartas[i + 1];
            }
            proxLivre--;
            return deCima;
        }
        return null;
    }

    public boolean poeCarta(Carta carta) { // insere a carta embaixo do baralho
        if (proxLivre < size - 1) {
            cartas[proxLivre] = carta;
            if (carta.isAberto()) {
                carta.viraCarta();
            }
            proxLivre++;
            return true;
        }
        return false;
    }

    public void embaralha() {
        for (int i = 0; i < 1000; i++) {
            int p1 = rand.nextInt(qntCartas());
            int p2 = rand.nextInt(qntCartas());
            Carta aux = cartas[p1];
            cartas[p1] = cartas[p2];
            cartas[p2] = aux;
        }
    }

    public void poeDeck(Deck deck) { // o objeto usado vai receber o deck do parâmetro em ordem aleatoria
        deck.embaralha();
        for (int i = 0; i < deck.qntCartas(); i++) {
            poeCarta(deck.tiraCarta());
        }
    }

    public boolean vazio() {
        return qntCartas() == 0;
    }

}
