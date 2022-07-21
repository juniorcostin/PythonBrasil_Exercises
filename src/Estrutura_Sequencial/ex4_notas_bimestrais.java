package Estrutura_Sequencial;
import java.util.Scanner;
public class ex4_notas_bimestrais {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe as 4 notas bimestrais: ");
        float nota1 = s.nextFloat();
        float nota2 = s.nextFloat();
        float nota3 = s.nextFloat();
        float nota4 = s.nextFloat();

        float resultado = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A sua média é: " + resultado);
    }
}
