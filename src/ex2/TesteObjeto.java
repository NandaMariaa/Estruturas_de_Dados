package ex2;

public class TesteObjeto {

    public static void main(String[] args) throws Exception {

        VetorObjeto vetor = new VetorObjeto(5);

        Contato c1 = new Contato("Maria", "(11) 113243546", "maria@gmail.com");
        Contato c2 = new Contato("João", "(11) 34281284", "joao@gmail.com");
        Contato c3 = new Contato("Claudia", "(11) 0127274", "claudia@gmail.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println(vetor.tamanho);
        System.out.println(vetor.toString());
        
    }
    
}
