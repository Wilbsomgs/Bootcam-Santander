package loop.forCase;

public class forEx001 {
    public static void main(String[] args) {
        // Formas de usar laço de repetição for 
        // 1: 
        for (var i = 0; i < 100;i++){
	       System.out.println("Olá, sejá bem vindo" + i);
        }

        // For each
        String[] nomes = {"Will", "Vitor", "Marcos"};

        for(var nome : nomes){
            System.out.println(nome);
        }
        
    }
}
