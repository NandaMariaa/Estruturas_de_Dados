package ex5;

import java.util.Stack;

public class Teste {

    public static void main(String[] args) {
        
        Stack <Integer> stack = new Stack <Integer> ();

        // ve se esta vazia
        System.out.println(stack.isEmpty());

        // empilhar
       stack.push(1);
       stack.push(2);
       stack.push(3);
       stack.push(4);
       stack.push(5);

       //ver tamanho
       System.out.println(stack.size());

       //exibe a pilha
       System.out.println(stack);

    }
    
}
