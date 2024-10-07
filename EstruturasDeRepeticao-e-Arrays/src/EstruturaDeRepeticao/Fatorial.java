package EstruturaDeRepeticao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Calcularemos o fatorial de: ");
        int numero = scanner.nextInt();
        int fatorial=1;

        if (numero==0){
            fatorial = 1;
            System.out.println("fatorial = " + fatorial); 
        }else{
            for(int i=1; i<=numero; i++){
                fatorial*=i;
            }
            System.out.println("Fatorial " + numero + "! = " + fatorial);
        }
        
        scanner.close();
    }
}
