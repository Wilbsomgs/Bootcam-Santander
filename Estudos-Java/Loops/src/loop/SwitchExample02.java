package loop;

import java.util.Scanner;

public class SwitchExample02 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 à 7");
        var option = scanner.nextInt();

        // Segunda maneira de utilizar o switch
        switch(option){
            case 1,6 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Opção inválida, digite uma válida.");
        }

        scanner.close();
    }
}
