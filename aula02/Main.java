public class Main(){
    public static void main(String[] args){
        Contador c1 = new Contador();//c1 --> variavel que aponta para o objeto, new --> cria o objeto, chamando o construtor do objeto
        //c1 passa a valer o valor(valor = 0)
        Contador c2 = new Contador();
        c1.incrementa();//incrementa apenas em c1
        c1.incrementa();
        c2.incrementa();
        System.out.printf("C1: %d\n", c1.getValor());
        System.out.printf("C2: %d\n", c2.getValor());
    }
}