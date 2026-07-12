import java.util.Scanner;

public class Main {

    // Constantes 
    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);
        String name = scanner.next();
        int age = scanner.nextInt(); 

        System.out.println("Olá " + name + "sua idade é " + age); // Forma tradicional

        System.out.printf("Olá %s sua idade é %s", name, age); // template string 

        scanner.close();

    }
}
