package EstudosJava.InterfacesJava.InterefacesFuncionais.Exemplo01;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Maria", 21), new User("João", 23), 
        new User("Eduardo",54), new User("Mariana", 32));

        printStringValue(user -> String.valueOf(user.age()), users);
       
    }

    private static void printStringValue(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}
