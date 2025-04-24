package prova;

public class TesteVetor {

    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor (5);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        vetor.adiciona("Elemento 4");
        vetor.adiciona("Elemento 5");

        vetor.aumentaCapacidade();
        
        vetor.adiciona("Elemento 6");
        vetor.adiciona("Elemento 7");
        vetor.adiciona("Elemento 8");



        System.out.println("a qnt de elementos no velor é de: " + vetor.tamanho());
        System.out.println("dados do vetor: " + vetor.toString());
        //System.out.println("informação na posição: " + vetor.busca(2));
        //System.out.println("informação na posição: " + vetor.busca1("Elemento 5"));

        //vetor.aumentaCapacidade ();
        //vetor.adicionaInicio(0, "Elemento 0");
        //System.out.println("a qnt de elementos no velor é de: " + vetor.tamanho());
        //System.out.println("dados do vetor: " + vetor.toString());
 
        //remove
        //vetor.remove(2);
        //System.out.println("a qnt de elementos no velor é de: " + vetor.tamanho());
        //ystem.out.println("dados do vetor: " + vetor.toString());
 
    }
    
}
