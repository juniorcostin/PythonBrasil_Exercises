package Estrutura_Sequencial;
import java.util.Scanner;
public class ex8_salario {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora: ");
        double valorHora = s.nextDouble();
        System.out.println("Informe o número de horas trabalhadas no mês: ");
        double numeroHoras = s.nextDouble();

        double resultado = valorHora * numeroHoras;
        System.out.println("Seu salário nesse mês é R$" + resultado);
    }
}
