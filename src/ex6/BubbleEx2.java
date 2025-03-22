package ex6;

import java.util.Scanner;

public class BubbleEx2 {

    public static void main (String[]args) {

        System.out.println("Vamos Ordernar sua Lista ;)");

        int vetor[] = new int [5];
        Scanner scan = new Scanner (System.in);

        for ( int i=0; i<vetor.length; i++) {
            System.out.println("Digite o " + i + "° número.");
            vetor [i] = scan.nextInt();
        }

        scan.close();

        int aux;
        for (int i =0; i<vetor.length; i++) {
            for ( int j = i + 1; j < vetor.length; j++) {
                if(vetor [i] > vetor [j]) {
                    aux = vetor [j];
                    vetor [j] = vetor [i];
                    vetor[i] = aux;
                }
            }

        }

        // exibindo vetor ordenado
        System.out.println("Vetor ordenado:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
        }

    }
    
}
