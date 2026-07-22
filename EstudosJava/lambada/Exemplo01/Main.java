package EstudosJava.lambada.Exemplo01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      Animal animal = () -> System.out.println("AuAu");

      System.out.println(animal);

      scanner.close();
    }
}
