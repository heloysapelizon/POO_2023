public class Deck {
    private Carta[] cartas;
    public final int size = 104;
    private int proxLivre;

    public Deck() {
        cartas = new Carta[size];
        proxLivre = 0;
    }

    public int qntCartas (){
        return proxLivre;
    }

    public Carta tiraCarta() { //retira a carta de cima
        if (proxLivre != 0){
            Carta deCima = cartas[0];
            for (int i = 0; i < proxLivre -1; i++){
                cartas[i] = cartas[i + 1];
            }
            proxLivre--;
            return deCima;
        }
        return null;
    }

    public boolean poeCarta(Carta carta) { //insere a carta embaixo do baralho
        if (proxLivre < size - 1) {
            cartas[proxLivre] = carta;
            proxLivre++;
            return true;
        }
        return false;
    }

}
