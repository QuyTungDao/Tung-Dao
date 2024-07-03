package java_2_7_2024;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new MyThread("My thread 1");
        Thread t2 = new MyThread("My thread 2");
        t2.setPriority(10);
        t1.setPriority(1);
        t1.start();
        t2.start();
    }
}
