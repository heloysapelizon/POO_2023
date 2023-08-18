public class Carta {
    private Naipe naipe;
    private Valor valor;
    private boolean aberto;

    public Carta(Naipe naipe, Valor valor){
        this.naipe = naipe;
        this.valor = valor;
        this.aberto = false;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void viraCarta (){
        aberto = !aberto;
    }

    @Override
    public String toString() {
        return "Carta [naipe=" + naipe + ", valor=" + valor + ", aberto=" + aberto + "]";
    }
    
    
}