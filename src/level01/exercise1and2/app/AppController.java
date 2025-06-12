package level01.exercise1and2.app;

import level01.exercise1and2.models.Employee;

import java.util.List;

public class AppController {

    public StringBuilder run() {

        AppService appService = new AppService();
        StringBuilder message = new StringBuilder();

        List<Employee> employees = appService.createEmployees();

        message.append("LISTING EMPLOYEES...\n");
        message.append(appService.printEmployees(employees));

        message.append("GETTING DEPRECATED METHODS...\n");
        message.append(appService.callDeprecatedMethods(employees));

        return message;
    }
}
