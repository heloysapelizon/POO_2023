public class App {
    public static void main (String [] args){
        Carta c = new Carta(Naipe.copas, Valor.dez);
        Carta c2 = new Carta(Naipe.espadas, Valor.dama);

        Deck d = new Deck();
        d.poeCarta(c);
        d.poeCarta(c2);

        Carta aux = d.tiraCarta();

        System.out.println(aux);
    }
}