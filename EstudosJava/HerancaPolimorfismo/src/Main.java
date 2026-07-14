public class Main {
    public static void main(String[] args) throws Exception {
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee){
        System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());
        
        switch (employee){
            case Manager manager ->{
                employee.setName("João");
                employee.setSalary(5000);
                manager.setLogin("joao");
                manager.setPassword("123456");
                manager.setComission(1200); 

                System.out.println(employee.getName());
                System.out.println(manager.getSalary());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getComission());
            }
            case Salesman salesman -> {
                salesman.setName("Lucas");
                salesman.setSalary(2800);

                System.out.println(salesman.getName());
                System.out.println(salesman.getSalary());
            }
            default -> {
                System.out.println("Nenhuma instância válida");
            }
        }   
    }
}
