package level01.exercise1and2.models;

public class InPersonEmployee extends Employee {

    private static int gas;

    public InPersonEmployee(String name, String surName, float pricePerHour) {
        super(name, surName, pricePerHour);
        InPersonEmployee.gas = 150;
    }


    @Override
    public float calculateSalary(float monthlyWorkedHours) {
        return ((monthlyWorkedHours * getPricePerHour()) + InPersonEmployee.gas);
    }

    @Deprecated
    public String oldMethodForSalary() {
        return "This is an old method for calculating salary.";
    }


    @Override
    public String legacyLine() {
        return oldMethodForSalary();
    }


    @Override @Deprecated
    public String toString() {
        return "IN PERSON EMPLOYEE\n"
                + "name: " + super.getName()
                + "\nsurname: " + super.getSurName()
                + "\npricePerHour: " + super.getPricePerHour()
                + "\ngas: " + this.gas + "\n";
    }
}
