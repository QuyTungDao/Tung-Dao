package java_21_5_2024;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentManagement sm = new StudentManagement();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student id: ");
        String id = sc.nextLine();


        if(sm.authentication(id) != null){
            System.out.println("Login Successfully!!!");
            System.out.print("Welcome to the student management system!");

            boolean flag = true;
            while(flag){
                System.out.println("Choose an option: ");
                System.out.println("1. Display student's information");
                System.out.println("2. Student have highest score");
                System.out.println("3. Student have lowest score");
                System.out.println("4. Student have highest Age");
                System.out.println("5. Student have lowest Age");
                System.out.println("6. Exit");

                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        sm.display();
                        break;
                        case 2:
                            sm.highestScore();
                            break;
                        case 3:
                            sm.lowestScore();
                            break;
                        case 4:
                            sm.highestAge();
                            break;
                        case 5:
                            sm.lowestAge();
                            break;
                        case 6:
                            flag = false;
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                }
            }
        else {
            System.out.println("Invalid student id");
        }
    }
}
