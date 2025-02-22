package ex2;

public class Vetor {

    //
    public String[] elementos;
    private int tamanho;

    //
    public Vetor(int capacidade) {

        this.elementos = new String [capacidade];
        this.tamanho = 0;

    }

    //
    public void adiciona(String elemento) throws Exception {

        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor cheio! Não será possível adicionar mais elementos");
        }

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

    //
    public String busca (int posicao) throws Exception {

        if(posicao >= 0 && posicao < tamanho) {
            return this.elementos[posicao];
        } else {
            throw new Exception("posição invalida!");
        }
    
    }

    //
    public int busca1 (String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if(elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }
        }
        return -1;
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

    public void remove2 (int posicao) throws Exception {
        
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


}
