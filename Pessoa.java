public class Pessoa
{
    // Atributos
    String nome;
    int idade;

    // Construtor
    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    // Método apresentar
    public void apresentar()
    {
        System.out.println("Olá, sou  " + nome + " e tenho " + idade + " anos.");
    }

    public static void main(String[] args)
    {
        // Criando 2 pessoas fixas
        Pessoa p1 = new Pessoa("Ana", 21);
        Pessoa p2 = new Pessoa("Maycon", 20);

        // Chamando apresentar
        p1.apresentar();
        p2.apresentar();
    }
}
