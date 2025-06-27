package level01.exercise1and2.app;

import level01.exercise1and2.models.Employee;
import level01.exercise1and2.models.InPersonEmployee;
import level01.exercise1and2.models.OnlineEmployee;

import java.util.ArrayList;
import java.util.List;

public class AppService {

    public List<Employee> createEmployees() {

        List<Employee> employees = new ArrayList<>();

        employees.add(new InPersonEmployee("Giraldina", "Delarosa", 20));
        employees.add(new OnlineEmployee("Luisiano", "Acapulta", 25));
        employees.add(new InPersonEmployee("Risielda", "Sertrelana", 20));
        employees.add(new OnlineEmployee("Rogismeldín", "Santigerundo", 25));

        return employees;
    }

    public Object printEmployees(List<Employee> employees) {

        StringBuilder message = new StringBuilder();

        for (Employee employee : employees) {
            message.append(employee)
                    .append("\n");
        }
        return message;
    }

    @SuppressWarnings("deprecation")
    public String callDeprecatedMethods(List<Employee> employees) {

        final String NL = System.lineSeparator();
        StringBuilder message = new StringBuilder();

        for (Employee employee : employees) {
            message.append(employee.legacyLine()).append(NL);
        }

        return message.toString();
    }
}
