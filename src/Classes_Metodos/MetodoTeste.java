package Classes_Metodos;

public class MetodoTeste
{
    public static void main( String[] args )
    {
        Metodos metodo = new Metodos();

        metodo.desconto = 3.5;
        metodo.preco = 4000.00;
        metodo.nome = "Notebook";
        metodo.precoComDesconto();
        metodo.precoComDesconto();

    }


}
