package testes;

import javax.swing.JOptionPane;

public class  teste2 {

    public static void main(String[] args) {
        String firstNumber =
            JOptionPane.showInputDialog("Primeiro número");
        String secondNumber =
            JOptionPane.showInputDialog("Segundo número"); 

        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum = number1 + number2;

        JOptionPane.showMessageDialog(null, "A soma é: " + sum, "Soma dos dois números", JOptionPane.PLAIN_MESSAGE);
    }
}