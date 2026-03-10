public class PilhaGenerica <T>{
    //atributos
    private static int TAM_DEFAULT = 100;
    private int topoPilha;
    private T e[];//ao usar generics,nao se usa tipos primitivos a menos q use wrappers (float e double por exemplo, viram classes, Float e Double)
    //construtores
    public PilhaGenerica(int tamanho){
        this.e = (T[]) new Object[tamanho];//por nao saaber qual tipo é (<T>), usamos Object que é a maneira mais geral de representar
        this.topoPilha = -1;

    }
    public PilhaGenerica(){
        this(TAM_DEFAULT);
    }
}

public boolean isEmpty(){
    return this.topoPilha == -1;
}

public boolean isFull(){
    return this.topoPilha == this.e.length-1;
}

public void push(T e) throws Exception{
    if (! this.isFull( ))
        this.e[++this.topoPilha] = e;
    else
        throw new Exception("overflow - Estouro de Pilha");
}

public T pop() throws Exception{
    if (! this.isEmpty( ))
        return this.e[this.topoPilha--];
    else{
        throw new Exception( "underflow- Esvaziamento de Pilha");
    }
}

public T topo() throws Exception{
    if ( ! this.isEmpty( ))
        return this.e[this.topoPilha];
    else{
    throw new Exception("Underlow -Esvaziamento de Pilha");
    }
}
// obtém o total de elementos armazenados na Pilha
public int sizeElements() {
    return topoPilha+1;
}
