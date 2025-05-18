package Aula1_Fundamentos;

public class Cast
{
    public static void main(String[] args)
    {
        // Forma implícita
        double a = 1;
        System.out.println( a );

        //Forma explícita (Cast)
        float b = (float) 2.3434343443353553;
        System.out.println( b );

        int c = 4;
        byte d = (byte) c; //Forma explícita (Cast)
        System.out.println( d );

        double e = 1.999999; //Forma explícita (Cast), perda de informacao
        int f = (int) e;
        System.out.println( f );
    }
}
