import java.util.regex.Pattern;

public class Placa{
    private String pais;
    private String codigo; // LLLNLNN

    public Placa(String pais,String codigo){
        this.pais = pais;
        if (Pattern.matches("[A-Z]{3}[0-9][A-Z][0-9]{2}", codigo) == true){
            this.codigo = codigo;
        }else{
            this.codigo = "AAA0A00";
        }
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String getPais(){
        return pais;
    }

    public String getCodigo(){
        return codigo;
    }

    public String toString(){
        if (codigo.equals("AAA0A00")){
            return("Invalida!");
        }else{
            return(codigo+"\nPais: "+pais);
        }
    }
}
/**
a) quais sao os atributos da classe placa?
pais e codigo

b) por que os atributos da classe placa sao privados?
porque o acesso deles é exclusivo dos metodos da propria classe, e nao ter inconsistência de dados

c) A classe "Placa" tem método construtor? O que ele faz? Quando ele é executado?
A classe placa possui o metodo construtor Placa, que define os atributos e formata o atributo codigo, ele é executado quando
um objeto de tipo placa é criado

d) Toda a classe deve ter um método construtor? O que acontece quando uma classe não tem método construtor?
Não é necessário, mas se nao tiver atributos será uma classe estática que apenas executa comandos

e) O que são métodos “getter” e “setter”? O que os caracteriza?
metodos getter são métodos de acesso a informações do objeto, e o setter permite fazer mudanças a elas

f) A classe "Placa" tem métodos do tipo "setter"? Por quê?
sim, pois é possivel mudar o país de uma placa de carro

g) Quais as implicações em se criar métodos “setter” para todos os atributos de uma classe?
todos os atributos da classe estarão sujeitos a mudanças
*/
