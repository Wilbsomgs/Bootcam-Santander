package SetType.HashSet.Exemplo01;
import java.util.*;
import java.util.function.Predicate;

public class Main{
    public static void main(String[] args) {
        Set<User> users = new HashSet();

        users.add(new User(1,"Jão"));
        users.add(new User(2,"Maria"));
        users.add(new User(3,"Juca"));
        users.add(new User(4,"Leo"));

        System.out.println("======ITERAÇÃO COM FOREACH======");
        System.out.println(users.contains(new User(1,"Jão")));
        users.forEach(System.out::println);

        // Outra forma de iterar sobre Set
        // Tipo set não possui index
        var iterator = users.iterator();

        System.out.println("======ITERAÇÃO COM ITERATOR======");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Se houver  o objeto ele remove
        System.out.println("======TESTANDO O REMOVEALL======");
        users.removeAll(List.of(new User(1,"Jão"), new User(2, "Lucas")));

        System.out.println(users);

        System.out.println("======TESTANDO O REMOVEIF======");
        users.removeIf(Predicate.not(user -> user.getId() > 2));

        System.out.println(users);
    }
}