import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EmployeeBook {

    private final Map<String, Employee> employees = new HashMap<>(Map.of());

    public EmployeeBook() {
    }


    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            System.out.println("Работник уже cуществует");
        }
        employees.put(employee.getFullName(), employee);
        return employee;
    }


    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.containsKey(employee.getFullName())) {
            System.out.println("Работник не найден");
        }
        return employees.get(employee.getFullName());
        }

        public Employee remove (String firstName, String lastName){
            Employee employee = new Employee(firstName, lastName);
            if (!employees.containsKey(employee.getFullName())) {
                employees.remove(employee.getFullName(), employee);
                System.out.println("Работник не найден");
            }
                return employee;

        }
    }


