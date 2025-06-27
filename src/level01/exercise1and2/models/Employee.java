package level01.exercise1and2.models;

public abstract class Employee {

    private String name;
    private String surName;
    private float pricePerHour;

    public Employee(String name, String surName, float pricePerHour) {
        this.name = name;
        this.surName = surName;
        this.pricePerHour = pricePerHour;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public float getPricePerHour() {
        return pricePerHour;
    }

    public abstract float calculateSalary(float monthlyWorkedHours);

    @Deprecated
    public abstract String legacyLine();

    @Override
    public String toString() {
        return "EMPLOYEE\n"
                + "name: " + this.name
                + "\nsurname: " + this.surName
                + "\npricePerHour: " + this.pricePerHour + "\n";
    }
}


