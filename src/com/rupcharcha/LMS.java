package com.rupcharcha;

import java.util.Scanner;

public class LMS {
    public static void main(String[] args) {
        System.out.println("Library Management System!");

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

                int choice = input.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Book list");
                        break;
                    case 2:
                        System.out.println("User list");
                        break;
                    case 3:
                        System.out.println("Add Book");
                        break;
                    case 4:
                        System.out.println("Update Book");
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }

            }else if (userChoice==2){
                System.out.println("1. Login");
                System.out.println("2. Registration");

            }else {
                System.out.println("Invalid Number Selected!");
            }

        }
    }
}