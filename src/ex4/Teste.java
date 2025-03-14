package ex4;

public class Teste {

    public static void main(String[] args) {

        //Pilha <Integer> pilha = new Pilha <Integer> ();

        //for (int i = 1; i <= 10; i++) {
        //pilha.empilha(i);

        //System.out.println(pilha.topo());

        //System.out.println(pilha);

        //pilha.empilha(1);
        //pilha.empilha(2);
        //pilha.empilha(3);

        //System.out.println(pilha.topo());

        //System.out.println(pilha);

        //pilha.desempilha();
        //System.out.println(pilha);

        //aula 5

        Fila<Integer> fila = new Fila<Integer>();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.enfileira(4);
        fila.enfileira(5);

        System.out.println(fila.toString());

        System.out.println(fila.espiar());
        if(fila.espiar() == null) {
            System.out.println("ninguem na fila");
        } else {
            System.out.println("primeira posição: " + fila.espiar());
        }

        System.out.println(fila.desenfileira());
        
        System.out.println(fila.toString());
    }
}
    
