package ex6;

public class BubbleSort {

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

    // metodo de ordenacao bubblesort;
    int aux;
    for(int i = 0; i < vetor.length; i++){
        for(int j = i + 1; j < vetor.length; j++){
            if(vetor[i] > vetor[j]){
            aux = vetor [j];
            vetor[j] = vetor [i];
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