package LoginSystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class logIn {
    private Scanner console = new Scanner(System.in);
    private String Username;
    private String Password;

    public void login(){

        System.out.print("Please enter your username: ");
        Username = console.nextLine();

        System.out.print("Please enter your password: ");
        Password = console.nextLine();

        CheckData(Username,Password);
    }

    private void CheckData(String userName,String password){
        try {
            RandomAccessFile raf = new RandomAccessFile("account.txt", "rw");
            String line = raf.readLine();
            Username= line.substring(9);
            Password= raf.readLine().substring(9);
            if(userName.equals(Username)&&(password.equals(Password))){
                System.out.println("Authentication successfully");
            } else System.out.println("Please check your username and password..");
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
