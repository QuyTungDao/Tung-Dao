package java_2_7_2024;

public class Main2 {
    public static void main(String[] args) {
        Student student = new Student();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                student.wakeup();
                student.study();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                student.breakfast();
            }
        });

        thread.start();
        t2.start();
    }
}
