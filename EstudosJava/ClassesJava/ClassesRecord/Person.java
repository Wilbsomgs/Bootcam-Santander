package EstudosJava.ClassesJava.ClassesRecord;

public record Person(String name, int age){
   
   
    public Person{ // Não precisa de parenteses
        System.out.println("=================================");
        System.out.println("Name " + name + " age: " + age); // Construtor compacto
        System.out.println("=================================");
        
    }
    
    /**
    * 
    public Person(String name){ // construtor secundário
     this(name,1);   
    }
    */
    
    public String getInfo(){
        return "Name: " + name + " age " + age;
    }
    
}