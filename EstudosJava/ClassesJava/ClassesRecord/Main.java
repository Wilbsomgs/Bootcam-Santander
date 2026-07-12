package EstudosJava.ClassesJava.ClassesRecord;


public class Main{
    public static void main(String[] args){
	var person = new Person("João", 12);
		
		System.out.println(person);
		System.out.println(person.name()); // acessa o name como se fosse metódo
	    System.out.println(person.getInfo());
	    
    }
}