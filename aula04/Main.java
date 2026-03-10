import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner = new Scanner(System.in);
        System.out.print("Entrada da fórmula: ");
        String formula = entrada.nextLine();
        if (estaBalanceada(formula)){
            System.out.println("Os parenteses estão balanceados");
        }else
            System.out.println("Não esta balanceada!");
    }
    public static boolean estaBalanceada(String formula){
        PilhaGenerica<Character> p = new PilhaGenerica<Character>();
        for(int i = 0; i < formula.length(); i++){
            char c = formula.charAt(i);
            try{
            if (c == '('){
                p.push(c);
            }
            else if (c == ')'){
                if (!p.isEmpty()){
                    p.pop();
                }
            }
            else {
                return false;
            }    
            }
        catch(Exception e);
        return p.isEmpty();
    }
}
