package ex4;

public class Teste {

    public static void main(String[] args) {

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
    
