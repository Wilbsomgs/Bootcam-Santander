package loop;

import java.util.Scanner;

public class SwitchExample04 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 à 7");
        var option = scanner.nextInt();

        
        // Segunda maneira de utilizar o switch
        var message = switch(option){
            case 1,7-> {
                var day = option == 1 ? "Domingo" : "Sábado"; // Operador ternário
                yield String.format("Hoje é  %s, fim de semana uhull", day); // yield indica onde será o retorno
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Opção inválida, digite uma válida.";
        };

        System.out.println(message);

        scanner.close();
    }
}
