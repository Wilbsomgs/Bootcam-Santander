package loop;
import java.util.Scanner;

public class SwitchExample01 {
    public static void main(String[] args) {
        //Usando o switch de forma tradiconal
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 à 7");
        var option = scanner.nextInt();

        switch(option){
            case 1: 
                System.out.println("Domingo");
                break;
            case 2: 
                System.out.println("Segunda");
                break;
            case 3: 
                System.out.println("Terça"); 
                break;
            case 4: 
                System.out.println("Quarta");
                break;
            case 5: 
                System.out.println("Quinta");
                break;
            case 6: 
                System.out.println("Sexta");
                break;
            case 7: 
                System.out.println("Sábado");
                break;
            default: 
                System.out.println("Opção inválida, digite uma válida.");     
        }

        scanner.close();
    }
}