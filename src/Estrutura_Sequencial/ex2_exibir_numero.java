package Estrutura_Sequencial;
import java.util.Scanner;

public class ex2_exibir_numero {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Infome um numero qualquer: ");
        int numero = s.nextInt();
        System.out.println("O numero informado foi: " + numero);
    }
}
