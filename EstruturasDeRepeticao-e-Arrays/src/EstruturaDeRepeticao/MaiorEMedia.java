package EstruturaDeRepeticao;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          
        int numero;
        int count =0;
        int maior = 0;
        int soma = 0;

        do{
        System.out.println("Digite o numero: ");
        numero=scanner.nextInt();

        count++;

        if(numero>maior){
            maior = numero;
        }

        soma+=numero;

        }while(count<5);

        System.out.println("Soma = " + soma);
        System.out.println("Maior numero = " + maior);
        System.out.println("Media = " + soma/5);

        scanner.close();
    }
}
