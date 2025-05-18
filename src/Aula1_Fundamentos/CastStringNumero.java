package Aula1_Fundamentos;

import javax.swing.*;

public class CastStringNumero
{
    public static void main(String[] args)
    {
        String num1 = JOptionPane.showInputDialog("Digite um numero: ");
        String num2 = JOptionPane.showInputDialog("Digite outro numero: ");

        System.out.println(num1 + num2);

        Double numero1 = Double.parseDouble(num1);
        Double numero2 = Double.parseDouble(num2);

        double resultado = numero1 * numero2;
        System.out.println( "Multiplicacao: " + resultado );
    }
}
