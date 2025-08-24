// Casting em Java
// Conversão de tipos primitivos e objetos

public class Casting {
    public static void main(String[] args) {
        // Casting implícito (widening)
        int inteiro = 100;
        long longo = inteiro; // int para long
        double decimal = inteiro; // int para double
        System.out.println("int para long: " + longo);
        System.out.println("int para double: " + decimal);

        // Casting explícito (narrowing)
        double valorDouble = 9.78;
        int valorInt = (int) valorDouble; // double para int
        System.out.println("double para int: " + valorInt);

        // Casting entre tipos primitivos
        short valorShort = (short) inteiro; // int para short
        byte valorByte = (byte) inteiro; // int para byte
        System.out.println("int para short: " + valorShort);
        System.out.println("int para byte: " + valorByte);

        // Casting entre char e int
        char letra = 'A';
        int codigo = letra; // char para int
        System.out.println("char para int: " + codigo);
        char novaLetra = (char) (codigo + 1); // int para char
        System.out.println("int para char: " + novaLetra);

        // Casting entre objetos (upcasting e downcasting)
        Object obj = "Texto"; // upcasting
        String texto = (String) obj; // downcasting
        System.out.println("Object para String: " + texto);
    }
}

