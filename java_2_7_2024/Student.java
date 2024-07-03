package java_2_7_2024;

public class Student {
    public synchronized void wakeup(){
        System.out.println("Student wakes up");
        try{
            wait();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public synchronized void study(){
        System.out.println("Student is studying at home");
    }

    public synchronized void breakfast(){
        System.out.println("Student is eating breakfast");
        notify();
    }
}
