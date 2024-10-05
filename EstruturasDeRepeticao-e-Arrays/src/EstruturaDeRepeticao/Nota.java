package EstruturaDeRepeticao;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        int nota = scanner.nextInt();

        while (nota<0 || nota>10) {
            System.out.println("Nota invalida. Digite novamente: ");
            nota = scanner.nextInt();
            
        }

        System.out.println("Nota valida: " + nota);
        scanner.close();

        
    }
}
