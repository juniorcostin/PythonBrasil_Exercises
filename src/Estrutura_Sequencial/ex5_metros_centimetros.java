package Estrutura_Sequencial;
import java.util.Scanner;

public class ex5_metros_centimetros {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a quantidade de metros que deseja transformar em centímetros: ");
        float metros = s.nextFloat();

        float centimetros = metros * 100;
        System.out.println(metros + " metros são equivalentes a " + centimetros + " centimetros");
    }
}
