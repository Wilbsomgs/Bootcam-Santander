package loop;

import java.util.Scanner;

public class SwitchExample03 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 à 7");
        var option = scanner.nextInt();

        
        // Segunda maneira de utilizar o switch
        var message = switch(option){
            case 1,6 -> "Fim de semana uhu"; 
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 7 -> "Sexta";
            default -> "Opção inválida, digite uma válida.";
        };

        System.out.println(message);

        scanner.close();
    }
}
