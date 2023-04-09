public class Main {

    public static void main(String[] args) {
         EmployeeBook employeeBook = new EmployeeBook();
         Employee employee = new Employee("Пётр", "Петров");


        employeeBook.add("Яков", "Петров");
        employeeBook.remove("Савелий", "Петров");
        employeeBook.find("Иван", "Петров");

        System.out.println(employee);

    }
}

