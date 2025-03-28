package ex6;

public class QuickSort {

    public static void main(String[] args) {
            
        // criando um vetor ne numeros inteiros com tamanho 10;
        int [] vetor = new int [10];

        // inserindo aleatóriamente os valores no vetor (0 ate 9);
        for (int i = 0; i < vetor.length; i++) {
        vetor [i] = (int) (Math.random() * vetor.length);

        // exibe vetor inicial
        System.out.println("Vetor:");

        }

        // Vetor Ordenado
        System.out.println("Vetor Ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor [i]);
        }

        //chama o método para ordenação
        ordenaQuickSort(vetor, 0, vetor.length -1);

        //método para ordenar
        static void ordenaQuickSort (int [] vetor, int esquerda, int direita) {
            if (esquerda < direita) {
                int p = particao (vetor, esquerda, direita);
                ordenaQuickSort (vetor, esquerda, p);
                ordenaQuickSort (vetor, p + 1, direita);
            }
        }


        //criar partições
        static int particao (int [] vetor, int esquerda, int direita) {

            int meio = (int) (esquerda + direita) / 2;
            int pivo = vetor [meio];
            int i = esquerda - 1;
            int j = direita + 1;

            while (true) {

                do {
                    i ++;
                } while (vetor [i] < pivo);

                do {
                    j--;
                } while (vetor [j] > pivo);
                if (i >= j) {
                    return j;
                }
                int aux = vetor [i];
                vetor [i] = vetor [j];
                vetor [j] = aux;
            }
        }   
    }
}
