package ex2;

public class exemplo2 {

    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor (5);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        vetor.adiciona("Elemento 4");
        vetor.adiciona("Elemento 5");

        System.out.println("a qnt de elementos no velor é de: " + vetor.tamanho());
        System.out.println("dados do vetor: " + vetor.toString());
        System.out.println("informação na posição: " + vetor.busca(3));
        System.out.println("informação na posição: " + vetor.busca(6));
        System.out.println("informação na posição: " + vetor.busca1("sabao"));

    }

    
}
