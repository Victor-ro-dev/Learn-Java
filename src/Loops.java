// Exemplos de loops em Java
public class Loops {
    public static void main(String[] args) {
        // Loop for
        System.out.println("Loop for:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // Loop while
        System.out.println("Loop while:");
        int j = 0;
        while (j < 5) {
            System.out.println("j = " + j);
            j++;
        }

        // Loop do-while
        System.out.println("Loop do-while:");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 5);
    }
}

