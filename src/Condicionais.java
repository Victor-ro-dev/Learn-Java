// Exemplos de estruturas condicionais em Java
public class Condicionais {
    public static void main(String[] args) {
        int nota = 7;
        // if-else
        if (nota >= 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        // switch
        char conceito = 'B';
        switch (conceito) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Bom");
                break;
            case 'C':
                System.out.println("Regular");
                break;
            default:
                System.out.println("Conceito desconhecido");
        }
    }
}

