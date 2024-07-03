package java_21_5_2024;

public class Information {
    private String id;
    private String name;
    private int age;
    public double gpa;

    public Information(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getGpa() {
        return this.gpa;
    }
}
