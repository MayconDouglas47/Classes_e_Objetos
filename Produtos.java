public class Produto
{
    String nome;
    double  preco;

    public Produto(String nome, double preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInfor()
    {
        System.out.println("Produto " + nome + " | Preço: R$ " + preco);
    }

    public static void main(String[]args)
    {
        Produto p1 = new Produto("Notebook", 3500.00);
        Produto p2 = new Produto("Mouse", 150.00);

        p1.exibirInfor();
        p2.exibirInfor();

        double soma = p1.preco + p2.preco;
        System.out.println("\nSoma dos preços: R$ " + soma);
    }
}
