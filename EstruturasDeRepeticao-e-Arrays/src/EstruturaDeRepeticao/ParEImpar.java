package EstruturaDeRepeticao;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite abaixo quantos numeros inteiros serao avaliados: ");

        int quantidadeDeNumeros = scanner.nextInt();
        int countPar = 0, countImpar = 0;
        int numeros;

        System.out.println("Digite os numeros abaixo: ");
        for(int i=0; i<quantidadeDeNumeros; i++){
            numeros = scanner.nextInt();

            if(numeros%2==0){
                countPar++;
            }else{
                countImpar++;
            }
        }

        System.out.println("Quantidade de numeros pares: " + countPar);
        System.out.println("Quantidade de numeros impares: " + countImpar);
        
        scanner.close();
    }
}
