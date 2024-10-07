package Arrays;

import java.util.Scanner;
import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        for(int[] linha : M){
            for(int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        scanner.close();









    }
}
