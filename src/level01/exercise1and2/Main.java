package level01.exercise1and2;

import level01.exercise1and2.app.AppController;
import level01.exercise1and2.app.AppService;

public class Main {
    public static void main(String[] args) {

        AppController appController = new AppController();

        System.out.println(appController.run());
    }
}
