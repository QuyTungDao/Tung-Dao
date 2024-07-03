package java_16_5_2024;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        try{
            System.out.println("Thuong 2 so la: "+(a/b));
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
        } catch(ArithmeticException e){
            System.out.println("Loi chia cho 0, vui long nhap vao so b khac 0");
        } catch(IOException e){
            System.out.println("Loix xay ra");
        }

        System.out.println("Tong 2 so la "+ (a+b));
    }
}
