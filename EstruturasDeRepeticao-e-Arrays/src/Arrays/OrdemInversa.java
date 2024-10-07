package Arrays;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int [6];

        System.out.println("Vetor original: ");
        for(int i=0; i<6; i++){
            vetor[i] = scanner.nextInt();
            //System.out.println("vetor[" + i + "] = " + vetor[i]);
        }

        int tamanhoVetorOriginal = vetor.length;
        int [] vetorInvertido = new int[tamanhoVetorOriginal];
        int tamanhoVetorOriginalZeroBased = tamanhoVetorOriginal - 1;

        for(int i=0; i<tamanhoVetorOriginal; i++){
            vetorInvertido[i] = vetor[tamanhoVetorOriginalZeroBased-i];
            System.out.println("vetorInvertido[" + i + "] = " + vetorInvertido[i]);
        }

    }
}
