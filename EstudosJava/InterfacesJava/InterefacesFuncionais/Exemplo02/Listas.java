package EstudosJava.InterfacesJava.InterefacesFuncionais.Exemplo02;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(3,4,12,4,4,2,1,4,7,9);
        numeros.sort((a,b)-> a-b);
        System.out.println(numeros);
    }
}
