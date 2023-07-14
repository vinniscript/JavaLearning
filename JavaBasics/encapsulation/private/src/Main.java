public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();

//        e.id = 16; -- Private variables can only be acessed inside it class. We can only access then creating getters and setters inside that class, and then calling it on the main.

        e.setID(16);
        e.setName("Algustos perneiras moles");
        e.setSalary(120); // Kuwanzas
            System.out.println("Name: " +e.getName());
            System.out.println("ID: " +e.getID());
            System.out.println("Salary: " +e.getSalary());
    }
}
