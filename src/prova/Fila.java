package prova;

public class Fila <T> extends EstruturaEstatica <T>{

    public Fila () {
        super ();
    }

    public Fila (int capacidade) {
        super(capacidade);
    }

    public void enfileira (T elemento) {
        this.adiciona(elemento);
    }

    public T espiar () {
        if (this.estaVazia()) { //verifica se esta vazia com o método da Estrutura
            return null; // retorna nulo ou "esta vazia", se isso for true
        }
     return this.elementos[0]; // retorna o indice 0, porque é a frente da fila :)
    }

    public T desenfileira () {
        if(this.estaVazia()){
            return null; // retorna nulo se ela estiver vazia.
        }

        final int POS = 0; // cria uma variavel auxiliar com o valor 0 (Frente da Fila)
 
        T elementoASerRemovido = this.elementos[POS];
        //cria uma variável T (elementoASerRemovido);
        // ela recebe o elemento do indice correspondende ao POS (indice 0);
        this.remove(POS); // removemos o que esta na frente na fila.
        return elementoASerRemovido; //retorna o que foi tirado.
        
    }

}