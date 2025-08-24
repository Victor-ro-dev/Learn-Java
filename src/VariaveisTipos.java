// Exemplos de declaração de variáveis e tipos primitivos em Java
public class VariaveisTipos {
    public static void main(String[] args) {
        // Tipos inteiros
        byte b = 10; // byte: 8 bits
        short s = 200; // short: 16 bits
        int idade = 25; // int: 32 bits
        long l = 100000L; // long: 64 bits

        // Tipos de ponto flutuante
        float altura = 1.75f; // float: 32 bits
        double peso = 70.5; // double: 64 bits

        // Tipo caractere
        char inicial = 'A'; // char: 16 bits (Unicode)

        // Tipo booleano
        boolean estudante = true; // boolean: 1 bit (valor lógico)

        // Tipo referência
        String nome = "João"; // String: objeto, tamanho variável

        // Exibindo valores
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + idade);
        System.out.println("long: " + l);
        System.out.println("float: " + altura);
        System.out.println("double: " + peso);
        System.out.println("char: " + inicial);
        System.out.println("boolean: " + estudante);
        System.out.println("String: " + nome);
    }
}
