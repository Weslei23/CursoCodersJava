package POO.Classes_Metodos;

public class ConstrutorTeste
{
    public static void main( String[] args )
    {
        Construtores construtor = new Construtores( 2.4, 300.40, "teclado" );

        System.out.println( "Nome: " + construtor.nome );
        System.out.println( "Preço: " + construtor.preco );
        System.out.println( "Desconto: " + construtor.desconto );
        System.out.println( "Preco com desconto do gerente" + construtor.precoComDesconto() );
        System.out.println( "Desconto: " + construtor.precoComDesconto() );
    }
}
