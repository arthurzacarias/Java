package projeto_media_anima;

import javax.swing.JOptionPane;

public class  projetomedia {

    public static void main(String[] args) {
        String notaA1 =
            JOptionPane.showInputDialog("Nota A1");
        String notaA2 =
            JOptionPane.showInputDialog("Nota A2"); 
        String notaA3 =
            JOptionPane.showInputDialog("Nota A3"); 

        int number1 = Integer.parseInt(notaA1);
        int number2 = Integer.parseInt(notaA2);
        int number3 = Integer.parseInt(notaA3);

        int sum = number1 + number2 + number3;

    if (number1 <= 30) {  
        
    if (number2 <= 30) {
    
    if (number3 <= 40) {

        if( sum >= 70) {
        JOptionPane.showMessageDialog(null, "A sua média é: " + sum,  "Média", JOptionPane.PLAIN_MESSAGE); 
            JOptionPane.showMessageDialog(null,"Parabéns, você foi aprovado", "Resultado", JOptionPane.PLAIN_MESSAGE);
        
        }else {
            JOptionPane.showMessageDialog(null, "A sua média é: " + sum,  "Média", JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null, "Você não atingiu o suficiente para ser aprovado, faça a AI ",  "Resultado", JOptionPane.PLAIN_MESSAGE);
            String notaAI =
                JOptionPane.showInputDialog("Nota AI");
            
        int number4 = Integer.parseInt(notaAI);

        if (number4 <= 30) { 
            
            if (number1 > number2) {
                int sum2 = number1 + number3 + number4;

                if( sum2 >= 70) {
                    JOptionPane.showMessageDialog(null, "A sua nova média é: " + sum2,  "Média", JOptionPane.PLAIN_MESSAGE); 
                        JOptionPane.showMessageDialog(null,"Parabéns, você foi aprovado", "Resultado", JOptionPane.PLAIN_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null, "A sua nova média é: " + sum2, "Média", JOptionPane.PLAIN_MESSAGE);
                        JOptionPane.showMessageDialog(null,"Você foi reprovado", "Resultado", JOptionPane.PLAIN_MESSAGE);
                } 
            }else {
                int sum3 = number2 + number3 + number4;

                if( sum3 >= 70) {
                    JOptionPane.showMessageDialog(null, "A sua nova média é: " + sum3,  "Média", JOptionPane.PLAIN_MESSAGE); 
                        JOptionPane.showMessageDialog(null,"Parabéns, você foi aprovado", "Resultado", JOptionPane.PLAIN_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null, "A sua nova média é: " + sum3, "Média", JOptionPane.PLAIN_MESSAGE);
                        JOptionPane.showMessageDialog(null,"Você foi reprovado", "Resultado", JOptionPane.PLAIN_MESSAGE); 
                }   
            }
        }else {
            JOptionPane.showMessageDialog(null, "Valor da AI INCORRETO, insira novamente", "Error", JOptionPane.PLAIN_MESSAGE);
        }
        }
    
    }else {
        JOptionPane.showMessageDialog(null, "Valor da A3 INCORRETO, insira novamente", "Error", JOptionPane.PLAIN_MESSAGE);
    }

    }else {
        JOptionPane.showMessageDialog(null, "Valor da A2 INCORRETO, insira novamente", "Error", JOptionPane.PLAIN_MESSAGE);
    }

    }else {
    JOptionPane.showMessageDialog(null, "Valor da A1 INCORRETO, insira novamente", "Error", JOptionPane.PLAIN_MESSAGE);
    }
}
}


