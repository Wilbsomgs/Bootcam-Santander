package loop.whileTrueCase;

import java.util.Scanner;

public class whileTrueEx001 {
    public static void main(String[] args) {
    
         var scanner = new Scanner(System.in);    
    
        while(true) {
            System.out.println("Informe um nome: ");
            
            var name = scanner.next();
            System.out.println(name);
        
        if (name.equalsIgnoreCase("exit")) break;
      }
      scanner.close();
    }
}
