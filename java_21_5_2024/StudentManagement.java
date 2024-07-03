package java_21_5_2024;

import java.util.ArrayList;

public class StudentManagement {
    ArrayList<Information> students = new ArrayList<>();
    private Information AuthenticatedStu;

    public StudentManagement() {
        Information stu = new Information("001","Tung",20,8.5);
        Information stu1 = new Information("002","Dat",21,9.5);
        Information stu2 = new Information("003","Nhi",22,7.5);
        Information stu3 = new Information("004","Dao",23,6.5);
        Information stu4 = new Information("005","An",24,5.5);
        students.add(stu);
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);
    }

    public Information authentication(String id){
        for (Information stu : students) {
            if (stu.getId().equals(id)) {
                AuthenticatedStu = stu;
                return stu;
            }
        }
        return null;
    }

    public void display(){
        System.out.println("Student's ID : "+AuthenticatedStu.getId());
        System.out.println("Student's Name : "+AuthenticatedStu.getName());
        System.out.println("Student's Age: "+AuthenticatedStu.getAge());
        System.out.println("Student's score: "+AuthenticatedStu.getGpa());
    }

    public void highestScore(){
        Information highest = students.get(0);
        for (Information stu : students) {
            if(highest.getGpa() < (stu.getGpa())){
                highest = stu;
            }
        }
        System.out.println("Highest score: " + highest.getGpa());
    }

    public void lowestScore(){
        Information lowest = students.get(0);
        for (Information stu : students) {
            if(lowest.getGpa() > (stu.getGpa())){
                lowest = stu;
            }
        }
        System.out.println("Lowest score: " + lowest.getGpa());
    }

    public void highestAge(){
        Information highest = students.get(0);
        for (Information stu : students) {
            if(highest.getAge() < (stu.getAge())){
                highest = stu;
            }
        }
        System.out.println("Highest age: " + highest.getAge());
    }

    public void lowestAge(){
        Information lowest = students.get(0);
        for (Information stu : students) {
            if(lowest.getAge() > (stu.getAge())){
                lowest = stu;
            }
        }
        System.out.println("Lowest age: " + lowest.getAge());
    }

}
