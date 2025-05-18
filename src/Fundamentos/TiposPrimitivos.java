package Fundamentos;

public class TiposPrimitivos
{
    public static void main( String[] args )
    {

        // Variaveis do tipo inteiro
        byte idade01 = 20;
        short idade02 = 21;
        int idade03 = 22;
        long idade04 = 23;

        System.out.println("Valor variável idade01 = " + idade01);
        System.out.println("Valor variável idade02 = " + idade02);
        System.out.println("Valor variável idade03 = " + idade03);
        System.out.println("Valor variável idade04 = " + idade04);

        // Variaveis com ponto flutuante
        double valorPassagem = 2.90;
        float valorTomate = 3.95F;

        System.out.println("Valor da passagem = " + valorPassagem);
        System.out.println("Valor do tomate = " + valorTomate);

        // Variaveis do tipo char
        char a = 'a';
        char b = 'b';
        char o = 111;
        char i = 105;
        char interrogacao = 0X003F; // valor '?'

        System.out.println(""+o+i+interrogacao);
        System.out.println(a);
        System.out.println(b);

        // Variaveis boolean True or False
        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println("O valor de verdadeiro é " + verdadeiro);
        System.out.println("O valor de false é " + falso);

        // Variavel String
        String texto = "Texto";
        System.out.println("String: " + texto);

        //Variaveis constantes
        final double PI = 3.14; // final define uma constante, por convensao escrevemos com letra maiuscula
        System.out.println("Variavel constante: " + PI);
    }
}
