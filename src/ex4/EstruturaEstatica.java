package ex4;

public class EstruturaEstatica <T> {

    
    public T[] elementos; // Array T = array de qualquer tipo de dado.
    public int tamanho; //Variavel que contará a quantidade de elementos que eu colocarei.
    
    
    @SuppressWarnings("unchecked")
    public EstruturaEstatica(int capacidade) { //contrutor que recebe a capacidade como paremetro.
        this.elementos = (T[]) new Object [capacidade]; //inicializa o array com a capacidade que eu informei.
        this.tamanho = 0; //o tamanho começa com 0, porque ainda esta vazio.
    }
    
    public EstruturaEstatica () {
        this (10);
    }

    public boolean adiciona ( T elemento) {
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length) { //verifica se quem espaço: 
            //(se a quantidade de dados inseridos é menor do que o tamanho do array)
            this.elementos[this.tamanho] = elemento; //adiciona o elemento no próximo espaço vazio
            this.tamanho++; //incrementa o tamanho;
            return true;
        }
        return false;
    }

    public boolean adiciona (int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição invalida");
        }
        this.aumentaCapacidade();
        for(int i=this.tamanho-1; i>=posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    public void aumentaCapacidade () {
        if(this.tamanho == this.elementos.length) {
            @SuppressWarnings("unchecked")
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho () {
        return this.tamanho;
    }

    @Override
    public String toString () {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for( int i = 0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho > 0) {
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();

    }

    public boolean estaVazia () {
        return this.tamanho == 0;
    }

    public void remove (int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida");
        }

        for(int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos [i+1];
        }

        tamanho--;

    }

}
    
