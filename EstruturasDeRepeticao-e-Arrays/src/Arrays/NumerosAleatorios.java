package Arrays;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int[] vetor = new int[20];
        
        for(int i=0; i<20; i++){
            vetor[i] = random.nextInt(100);
        }

        for(int i=0; i<20; i++){
            System.out.println("vetor[" +i+ "] = " + vetor[i]);
        }

        scanner.close();
    }
}
