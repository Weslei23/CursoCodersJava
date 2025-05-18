package Aula1_Fundamentos;

public class Wrappers
{
    public static void main(String[] args)
    {
        //Byte
        Byte b = 127;
        Short s = 1000;

        // Integer.parseInt(entrada.next());
        Integer i = 12700; //int
        Long l = 10000L;

        System.out.println( b.byteValue() );
        System.out.println( s.toString() );
        System.out.println( i * 3 );
        System.out.println( l / 3 );

        Float f = 123.456f;
        System.out.println( f );

        Double d = 123.456d;
        System.out.println( d);

        Boolean bool = Boolean.parseBoolean( "true" );
        System.out.println( bool );
        System.out.println( bool.toString().toUpperCase() );

        Character c = 'a'; //char
        System.out.println( c + "....." );
    }
}
