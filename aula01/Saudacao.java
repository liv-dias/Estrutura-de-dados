import java.util.Scanner;

public class Saudacao{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Ola, " + nome + "!");
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Nome: " + nome + " Idade: " + idade);
        System.out.printf("Nome: %s Idade: %d\n", nome, idade);
    }
}