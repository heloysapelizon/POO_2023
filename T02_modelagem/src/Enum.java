public class Enum {
    public static void main (String [] args){
        Naipe x;

        x = Naipe.copas;

        System.out.println(x.name());
        System.out.println(x.ordinal());
        for (int i = 0; i < Naipe.values().length; i++){
            System.out.println(Naipe.values()[i]);
        }
    }
}
