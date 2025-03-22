package ex6;

public class InsertionSort {
    public static void main(String[] args) {

        // criando um vetor ne numeros inteiros com tamanho 10;
        int [] vetor = new int [10];

        // exibe vetor inicial
        System.out.println("Vetor:");

        // inserindo aleatóriamente os valores no vetor (0 ate 9);
        for (int i = 0; i < vetor.length; i++) {
        vetor [i] = (int) (Math.random() * vetor.length);

        // exibindo os valores do vetor;
        System.out.println(vetor[i]);

        }

        int aux, j;
        for(int i = 1; i < vetor.length; i++) {
            aux = vetor [i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[ j + 1 ] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }

        System.out.println("Vetor Ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor [i]);
        }
        
    }
    
}
