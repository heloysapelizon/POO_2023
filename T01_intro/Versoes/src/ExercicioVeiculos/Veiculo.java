public class Veiculo{
    private final double consumoPorLitro = 10;
    private Placa placa;
    private double combustivel;
    
    public Veiculo(Placa placa){
        this.placa = placa;
        combustivel = 0;
    }

    public void setPais(String pais){
        placa.setPais(pais);
    }

    public Placa getPlaca(){
        return placa;
    }

    public double getCombustivelNoTanque(){
        return combustivel;
    }

    public double abastece(double litros){
        if (litros > 0.0){
            if (combustivel + litros > 80){
                combustivel = 0;
                litros = 80;
            }
            combustivel += litros;
        }
        return combustivel;
    }
    // Simula o deslocamento do carro por uma determinada distancia em Km:
    //  - Diminui a quantidade de combustivel gasto do tanque
    //  - Retorna a distancia efetivamente percorrida (com o combustivel disponivel)
    public double dirige(double distancia){
        // Para distancias impossíveis retorna 0
        if (distancia <= 0){
            return 0.0;
        }
        // Calcula o consumo para a distancia
        double consumo = distancia / consumoPorLitro;
        // Diminui o combustivel gasto e retorna a distancia percorrida
        if (combustivel >= consumo){
            combustivel -= consumo;
            return distancia;
        }else{
            double distPossivel = combustivel * consumoPorLitro;
            combustivel = 0.0;
            return distPossivel;
        }
    }

    public String toString(){
        return "Placa: "+getPlaca()+"\nCombustivel no tanque: "+getCombustivelNoTanque();
    }
}

/**
h) Quantos atributos tem a classe "Veiculo"? De que tipo são? Algum dos atributos de "Veiculo" indica um relacionamento entre as classes?
a classe veiculo tem 3 atributos de tipo double e Placa, no qual um deles é um objeto de tipo de outra classe criada

i) Porque os atributos da classe "Veiculo" são privados? Qual a vantagem de se manter os atributos das classes privados?
porque so sao acessiveis por metodos da propria classe, garantindo que nao sei

j) A classe "Veiculo" tem método construtor? O que ele faz? Quando é executado?
Sim, é executado a cada nova criação de um objeto do tipo veiculo, inicializando o combustivel com 0

k) Porque não é necessário criar uma instancia da classe "Placa" no construtor da classe "Veiculo"?
porque a classe placa ja inicializa o objeto quando é criado o atributo placa

l) A classe "Veiculo" tem métodos do tipo "setter"? Por quê?
sim, para poder acessar um atributo de um atributo da classe

m) Para que serve o modificador "final" no atributo "consumoPorLitro"?
para que seu valor nao mude depois

n) De que maneira funcionam os métodos "getCombustivelNoTanque", "abastece" e "dirige"?
o método getCombustivelNoTanque é um método de acesso a o estoque de combustivel disponivel, o abastece adiciona um valor a esse estoque,
e o dirige diminui um valor ao estoque

o) Quantas instâncias de que classes são criadas no "main"?
 */