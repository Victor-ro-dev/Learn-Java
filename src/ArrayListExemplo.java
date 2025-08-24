import java.util.ArrayList;

// Exemplos de uso de ArrayList e seus métodos em Java
public class ArrayListExemplo {
    public static void main(String[] args) {
        // Declaração e inicialização
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionando elementos
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        System.out.println("Nomes: " + nomes);

        // Acessando elementos
        System.out.println("Primeiro nome: " + nomes.get(0));

        // Alterando elementos
        nomes.set(1, "Beatriz");
        System.out.println("Nomes após alteração: " + nomes);

        // Removendo elementos
        nomes.remove("Carlos");
        System.out.println("Nomes após remoção: " + nomes);

        // Tamanho da lista
        System.out.println("Tamanho: " + nomes.size());

        // Verificando se contém um elemento
        System.out.println("Contém 'Ana'? " + nomes.contains("Ana"));

        // Índice de um elemento
        System.out.println("Índice de 'Ana': " + nomes.indexOf("Ana"));

        // Verificando se está vazia
        System.out.println("Está vazia? " + nomes.isEmpty());

        // Limpando a lista
        nomes.clear();
        System.out.println("Nomes após clear: " + nomes);

        // Percorrendo com for
        nomes.add("Daniel");
        nomes.add("Eduarda");
        System.out.println("Percorrendo com for:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        // Percorrendo com foreach
        System.out.println("Percorrendo com foreach:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

