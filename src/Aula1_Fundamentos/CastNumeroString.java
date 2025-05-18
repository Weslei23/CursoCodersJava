package Aula1_Fundamentos;

public class CastNumeroString
{
    public static void main(String[] args)
    {
        Integer numero = 1232323;
        System.out.println( numero.toString().length() );

        int num2 = 1232323;
        System.out.println( Integer.toString( num2 ).length() );

        System.out.println( ( "" + numero ).length() );
        System.out.println( ( "" + num2 ).length() );
    }
}
