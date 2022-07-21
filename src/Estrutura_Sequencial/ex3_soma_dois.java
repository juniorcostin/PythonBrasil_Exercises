package Estrutura_Sequencial;
import java.util.Scanner;
public class ex3_soma_dois {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o primeiro numero para a soma: ");
        int num1 = s.nextInt();
        System.out.println("Informe o segundo numero para a soma: ");
        int num2 = s.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma dos dois números informados é: " + soma);
    }
}
