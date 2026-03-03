public class Pilha {
    //atributos
    private static final int TAM_DEFAULT = 100;
    private int topoPilha;
    private int elementos[];
    //construtores
    public Pilha(int tamanho){
        this.elementos = new int[tamanho]; //this referencia o proprio objeto, usa para acessar elementos
        this.topoPiha = -1;
    }

    public Pilha(){
        this(TAM_DEFAULT);//vai chamar o elementos e o topoPilha de cima para aproveitar código
    }
    //métodos
    public boolean isEmpty(){
        if (topoPilha == -1)
            return true;
        else 
            return false;//ou só return this.topoPilha == -1; ou return topoPilha == -1;
    }
    public boolean isFull(){
        return topoPilha == elementos.length - 1;
    }

    
    public void push(int e) throws Exception {
        if (!this.isFull()){
            topoPilha++;
            this.elementos[topoPilha] = e;
        }
        else {
            throw new Exception("Overflow - Estouro de pilha.");
        }
    }

    public int pop() throws Execption {
        if(!this.isEmpty()){
            int temp = this.elemento[topoPilha];
            topoPilha--;
            return temp;
        }
        else{
            throw new Exception("Underflow - Esvaziamento de Pilha");
        }
    }

    public int topo() throws Exception{
        if(!this.isEmpty()){
            return this.elementos[topoPilha];
        }
        else{
            throw new Exception("Underflow - Esvaziamento de pilha.");
        }
    }

    public int sizeElements(){
        return topoPilha + 1;
    }
}