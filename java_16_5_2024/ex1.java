package java_16_5_2024;

import java.util.Scanner;

public class ex1 {
    
    public static void main(String[] args) {
    int a;
    Scanner sc = new Scanner(System.in);

    while (true){
        try {
            a = sc.nextInt();
            System.out.println("So vua nhap la: "+a);
            break;
        } catch (Exception e) {
            System.out.println("Nhap vao so nguyen: ");
            sc.next();
        }
    }
    }
}
