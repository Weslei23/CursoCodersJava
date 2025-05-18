package Fundamentos;

public class Console
{
    public static void main( String[] args )
    {
        System.out.println( "Bom" ); // Cria uma nova linha
        System.out.println( "Dia" );

        // Printar na mesma linha
        System.out.print( "Bom " );
        System.out.print( "Dia" );
        System.out.print( "\n" );

        // Printar com formatação
        System.out.printf( "Megasena: %d %d", 1, 2 );
    }
}
