package prova;

public class Vetor {

    //
    public String[] elementos; // "elementos" é um Array de Strings que armazenará os elementos do meu vetor.
    private int tamanho; // "tamanho" É um atributo que ve quantos elementos foram adicionados ao vetor. 
                        //Ele é inicializado como 0 e é incrementado à medida que novos elementos são adicionados.

    //
    public Vetor(int capacidade) { // O construtor recebe um parâmetro capacidade, que determina o tamanho máximo do vetor.

        this.elementos = new String [capacidade]; // Inicializa o array elementos com o tamanho especificado pela capacidade.
        this.tamanho = 0; //Inicializa o tamanho atual do vetor como 0, indicando que ele está vazio.

    } 

    //
    public void adiciona(String elemento) throws Exception {

        if (this.tamanho < this.elementos.length){ //Verifica se o número atual de elementos (tamanho) é menor que a capacidade máxima do vetor (elementos.length).
            this.elementos[this.tamanho] = elemento; //Coloca o novo elemento na próxima posição disponível no array.
            this.tamanho++; // Incrementa o valor de tamanho para refletir que um novo elemento foi adicionado.
        } else {
            throw new Exception("Vetor cheio! Não será possível adicionar mais elementos");
        }   //Caso o vetor esteja cheio (nenhum espaço disponível), o método lança uma exceção informando que não é possível adicionar mais elementos.

    } 

    //
    public int tamanho () {

        return this.tamanho;

    }

    //
    @Override
    public String toString () {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i = 0; i < this.tamanho -1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho > 0) {
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
        
    }

    //Esses dois métodos (busca e busca1) são utilizados para localizar elementos no vetor. Vamos explicá-los detalhadamente:

    public String busca (int posicao) throws Exception { // parametro "posicao" = A posição no vetor da qual queremos recuperar o elemento. 
                                                        //Lembre-se de que índices em arrays Java começam em 0.
        if(posicao >= 0 && posicao < tamanho) { // Verifica se a posição solicitada é válida
            return this.elementos[posicao]; // Se a posição for válida, o método retorna o elemento armazenado em this.elementos[posicao].
        } else {
            throw new Exception("posição invalida!"); // Se a posição não estiver válida, mensagem de erro!
        }
    
    }

    //
    public int busca1 (String elemento) { // parametro "elemento" = O elemento que estamos procurando no vetor.
        for (int i = 0; i < tamanho; i++) { // Percorre o vetor desde o primeiro elemento (índice 0) até o último elemento adicionado (índice tamanho - 1).
            if(elementos[i].equalsIgnoreCase(elemento)) { //Compara o elemento atual (elementos[i]) com o elemento buscado, 
                                                        //ignorando diferenças entre letras maiúsculas e minúsculas (equalsIgnoreCase).
                return i; //Se o elemento for encontrado, retorna o índice (i) correspondente.
            }
        }
        return -1; //Caso o loop termine sem encontrar o elemento, o método retorna -1, indicando que o elemento não está no vetor.
    }


    //aula 3 .........

    public boolean adicionaInicio (int posicao, String elemento) throws Exception {
        this.aumentaCapacidade();
        if (posicao >= 0 && posicao < tamanho) {
            for (int i = this.tamanho -1; i >= posicao; i--) {
                this.elementos[i + 1] = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;

        } else {
            throw new Exception("Posição Invalida ");
        }
        return true;
    }

    public void aumentaCapacidade () {
        if (this.tamanho == this.elementos.length) {
            String [] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void adiciona1 (String elemento) throws Exception {
        this.aumentaCapacidade();
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public void remove (int posicao) throws Exception {
        if (posicao >=0 && posicao <tamanho) {
            for (int i = posicao; i < this.tamanho-1; i++) {
                this.elementos[i] = this.elementos[i+1];
            }
            this.elementos[tamanho] = null;
            this.tamanho--;
        } else {
            throw new Exception("Posição inválida");
        }
    }

    public void remove2 (int elemento) throws Exception {
        
    }

    
}
