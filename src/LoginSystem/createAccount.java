package LoginSystem;

import java.io.*;

import java.util.Scanner;

public class createAccount {
    private Scanner console = new Scanner(System.in);


    public void createAccount() {
        readFile();

        System.out.print("Please enter your username: ");
        String userName = console.nextLine();

        System.out.print("Please enter your password: ");
        String password = console.nextLine();

        System.out.print("Please enter your email: ");
        String email = console.nextLine();

        addData(userName, password, email);
    }
    private void readFile(){
        try{
            FileReader fr = new FileReader("account.txt");
            System.out.println("file exists!");
        } catch (FileNotFoundException e){
            try{
                FileWriter fw = new FileWriter("account.txt");
                System.out.println("File created");
            } catch(IOException ex){
                ex.printStackTrace();
            }

        }

    }
    private void addData(String userName, String password, String email){
        try {
            RandomAccessFile raf = new RandomAccessFile("account.txt","rw");
            raf.writeBytes("Username:"+userName +"\r\n");
            raf.writeBytes("Password:"+password +"\r\n");
            raf.writeBytes("Email:"+email +"\r\n");
            raf.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}

