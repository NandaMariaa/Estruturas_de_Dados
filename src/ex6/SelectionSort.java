package ex6;

public class SelectionSort {

    public static void main(String[] args) {

        // criando um vetor ne numeros inteiros com tamanho 10;
        int [] vetor = new int [15];

        // exibe vetor inicial
        System.out.println("Vetor:");

        // inserindo aleatóriamente os valores no vetor (0 ate 9);
        for (int i = 0; i < vetor.length; i++) {
        vetor [i] = (int) (Math.random() * vetor.length);

        // exibindo os valores do vetor;
        System.out.println(vetor[i]);

        }

        // método de ordenação InsertionSort
        int menor_posicao, aux;
        for(int i = 0; i < vetor.length; i++) {
            menor_posicao = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor [j] < vetor [menor_posicao]) {
                    menor_posicao = j;
                }
            }
            aux = vetor [menor_posicao];
            vetor [menor_posicao] = vetor [i];
            vetor [i] = aux;

        }

        // Vetor Ordenado
        System.out.println("Vetor Ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor [i]);
        }
        
    }
    
}
