package Estrutura_Sequencial;
import java.util.Scanner;
public class ex6_calculo_raio {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o raio de um círculo: ");
        double raio = s.nextDouble();

        double area = Math.PI * raio * raio;
        System.out.println("A area do raio informado é: " + area);

    }
}
