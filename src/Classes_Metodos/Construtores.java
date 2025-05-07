package Classes_Metodos;

public class Construtores
{
    String nome;
    double preco;
    double desconto;

    // Construtor deve sempre ter o nome da classe
    public Construtores( double desconto, double preco, String nome )
    {
        this.desconto = desconto;
        this.preco = preco;
        this.nome = nome;
    }

    double precoComDesconto()
    {
        return preco * ( 1- desconto );
    }

    double precoComDesconto( double descontoDoGerente )
    {
        return preco * ( 1- desconto + descontoDoGerente );
    }
}
