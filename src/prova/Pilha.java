package prova;

public class Pilha <T> extends EstruturaEstatica <T> {

    public Pilha () {
        super();
    }
    
    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha (T elemento) {
        super.adiciona(elemento);
    }

    public T topo () {
        if(this.estaVazia()) { //verifica se ta vazio
            return null;
        } else {
            return this.elementos[tamanho -1]; // retorna o elemento que esta em cima
            // tamanho total -1
        }
    }

    public T desempilha () {
        if(this.estaVazia()) {
            return null; // verifica se esta vazia
        }
        T elemento = this.elementos[tamanho-1]; //cria uma variável elemento
        // ela recebe o elemento que esta no topo (o que será retirado)
        this.elementos[tamanho-1] = null; //retira o elemento do topo
        //tranformando o tamanho -1 para Nulo.
        tamanho -- ; //decrementa o tamanho
        return elemento; // retorna o que foi retirado.
    }
}
