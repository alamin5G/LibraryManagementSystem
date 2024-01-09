package com.rupcharcha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------Library Management System-------------------");


        while (true){
            System.out.println("1 for Librarian");
            System.out.println("2 for User");


            Scanner input = new Scanner(System.in);
            int userChoice = input.nextInt();
            if (userChoice==1){
                System.out.println("1 Book List");
                System.out.println("2. User List");
                System.out.println("3. Add Book");
                System.out.println("4. Update Book");
                System.out.println("5. Remove Book");
                System.out.println("6. Search Book");
                System.out.println("7. User Logs");
                System.out.println("8. Logout");

            }else if (userChoice==2){

            }else {
                System.out.println("Invalid Number Selected!");
            }

        }


    }
}