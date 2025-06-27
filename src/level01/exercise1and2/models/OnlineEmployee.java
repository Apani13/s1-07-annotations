package level01.exercise1and2.models;

public class OnlineEmployee extends Employee {

    private final int internetPrice = 60;

    public OnlineEmployee(String name, String surName, float pricePerHour) {
        super(name, surName, pricePerHour);
    }


    @Override
    public float calculateSalary(float monthlyWorkedHours) {
        return (monthlyWorkedHours * getPricePerHour()) + this.internetPrice;
    }

    @Deprecated
    public String oldMethodForInternet() {
        return "This is an old method for adding internet price";
    }


    @Override @Deprecated
    public String legacyLine() {
        return oldMethodForInternet();
    }

    @Override
    public String toString() {
        return "ONLINE EMPLOYEE\n"
                + "name: " + super.getName()
                + "\nsurname: " + super.getSurName()
                + "\npricePerHour: " + super.getPricePerHour()
                + "\ninternetPrice: " + this.internetPrice + "\n";
    }
}
