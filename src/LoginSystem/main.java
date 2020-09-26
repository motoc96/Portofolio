package LoginSystem;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("Hello there!");
        System.out.println("Press 1 to Log In...");
        System.out.println("Press 2 to Create an Account...");
        System.out.println("Press 0 to Quit the Application");
        System.out.print("Waiting for your input: ");

        Scanner console = new Scanner(System.in);
        createAccount cA = new createAccount();
        logIn login = new logIn();
        int value = console.nextInt();
        do {
            System.out.println();
            switch (value) {
                case 0 -> System.out.println("Quiting..");
                case 1 -> {
                    login.login();
                    value = 0;
                }
                case 2 -> {
                    cA.createAccount();
                    value = 0;
                }
                default -> {
                    System.out.println("You have entered an invalid number. Please try again..");
                    System.out.print("Waiting for your input: ");
                    value = console.nextInt();
                }
            }
        }while(value != 0);
    }
}
