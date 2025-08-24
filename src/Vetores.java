// Exemplos de uso de vetores (arrays) em Java
public class Vetores {
    public static void main(String[] args) {
        // Declaração e inicialização de um vetor de inteiros
        int[] numeros = {1, 2, 3, 4, 5};

        // Acessando elementos
        System.out.println("Primeiro elemento: " + numeros[0]);
        System.out.println("Tamanho do vetor: " + numeros.length);

        // Alterando valores
        numeros[2] = 10;
        System.out.println("Novo valor no índice 2: " + numeros[2]);

        // Percorrendo o vetor com for
        System.out.println("Todos os elementos (for):");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Percorrendo o vetor com foreach
        System.out.println("Todos os elementos (foreach):");
        for (int n : numeros) {
            System.out.println(n);
        }
    }
}

