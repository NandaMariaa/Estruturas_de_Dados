package ex1;

import javax.swing.JOptionPane;

public class exemplo1 {

    public static void main(String[] args) throws Exception {

        int [] temperatura = new int [7];
        int soma, media;
        int contador, dias_acima, dias_abaixo;
        soma = 0;
        
        for(contador = 0; contador <7; contador++){

            temperatura[contador] = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + (contador + 1) + " Temperatura" ));
            soma = soma + temperatura[contador]; 
        }

        media = soma/7;
        dias_acima = 0;
        dias_abaixo = 0;
        
        for(contador = 0; contador <7; contador++){
            if(temperatura[contador]>media){
                dias_acima = dias_acima + 1;
            }
            if(temperatura[contador]<media){
                dias_abaixo = dias_abaixo + 1;
            }
        }

        JOptionPane.showMessageDialog(null,"A média das temperaturas é: " + media);
        JOptionPane.showMessageDialog(null,"Dias acima: " + dias_acima);
        JOptionPane.showMessageDialog(null,"Dias abaixo: " + dias_abaixo);

    }

}