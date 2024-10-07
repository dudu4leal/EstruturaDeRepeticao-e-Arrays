package EstruturaDeRepeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual tabuada vamos calcular?");
        int tabuada = scanner.nextInt();
        int produto;

        System.out.println("Resustado: ");
        for(int i=1; i<=10; i++){
        produto = tabuada*i;
        System.out.println(tabuada + " x " + i + " = " + produto);     
        }

        scanner.close();
    }
}
