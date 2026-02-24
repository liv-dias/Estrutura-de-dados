public class Contador{
    //atributos, entra no objeto contador, com um endereço de memoria especifico(ctrl + alt + q --> adiciona barra pra comentario)
    int valor;


    //construtores, se nao colocar o java adiciona sozinho sem parametros
    public Contador(){
        valor = 0;
    }

    //métodos
    public void incrementa(){
        valor++;
    }

    public void zera(){
        valor = 0;
    }

    public int getValor(){
        return valor;
    }
}