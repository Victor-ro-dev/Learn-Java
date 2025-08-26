// Exemplo de Classe e Construtor em Java

public class Pessoa {
    // Atributos da classe
    private String nome;
    private int idade;

    // Construtor padrão (sem parâmetros)
    public Pessoa() {
        this.nome = "Desconhecido";
        this.idade = 0;
    }

    // Construtor com parâmetros
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(); // Usando construtor padrão
        p1.apresentar();

        Pessoa p2 = new Pessoa("Maria", 25); // Usando construtor com parâmetros
        p2.apresentar();
    }
}

