package Aula1_Fundamentos;

public class OperadoresLogicos
{
    public static void main(String[] args)
    {
        /*
        Os operadores lógicos do Java são usados para criar expressões lógicas (verdadeiras ou falsas). Os operadores lógicos mais comuns são:

        "&&" (E lógico): retorna verdadeiro se ambas as expressões forem verdadeiras.
        Exemplo: (x < 5 && y > 0) retornaria verdadeiro somente se x fosse menor que 5 e y fosse maior que 0.

        "||" (OU lógico): retorna verdadeiro se pelo menos uma das expressões for verdadeira.
        Exemplo: (x < 5 || y > 0) retornaria verdadeiro se x fosse menor que 5 ou y fosse maior que 0.

        "!" (Não lógico): inverte o valor lógico da expressão.
        Exemplo: !(x < 5) retornaria verdadeiro se x não fosse menor que 5.

        "&" (E lógico curto-circuitado): igual a &&, mas não avalia a segunda expressão se a primeira já for falsa.
        Exemplo: (x < 5 & y/x > 2) se x for menor que zero, y/x não será avaliado evitando um erro de divisão por zero.

        "|" (OU lógico curto-circuitado): igual a ||, mas não avalia a segunda expressão se a primeira já for verdadeira.
        Exemplo: (x < 5 | y/x > 2) se x for menor que cinco, y/x não será avaliado evitando um erro de divisão por zero.

        "^" (OU exclusivo): retorna verdadeiro se apenas uma das expressões for verdadeira.
        Exemplo: (x < 5 ^ y < 5) retornaria verdadeiro se x fosse menor que 5 ou y fosse menor que 5, mas não ambos.

         */

        int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = ( valor1 == 1 ) && ( valor2 == 2 );
        System.out.println( "valor1 é 1 AND valor2 é 2 - resultado: " + resultado1 );

        boolean resultado2 = ( valor1 == 1 ) || ( valor2 == 2 );
        System.out.println( "valor1 é 1 OR valor2 é 2 - resultado: " + resultado2 );

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println( verdadeiro && falso );
        System.out.println( verdadeiro || falso );
        System.out.println( verdadeiro ^ falso );
        System.out.println( !verdadeiro || falso );
    }
}
