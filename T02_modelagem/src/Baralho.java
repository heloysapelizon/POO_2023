public class Baralho {
    private Deck cartas;

    public Baralho(){
        cartas = new Deck();
        for (Naipe n : Naipe.values()){
            for (Valor v : Valor.values()){
                Carta carta = new Carta(n, v);
                cartas.poeCarta(carta);
            }
        }
    }

    public int qntCartas(){
        return cartas.qntCartas();
    }
    public boolean vazio (){
        return cartas.qntCartas() ==0;
    }
    public Carta tiraCarta(){
        return cartas.tiraCarta();
    }

    public void embaralha (){
        cartas.embaralha();
    }
}