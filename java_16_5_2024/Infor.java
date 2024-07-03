package java_16_5_2024;

public class Infor {
    private String id;
    private String name;
    private String password;
    private double balance;

  public Infor (String id,String name,String password,double balance){
        this.id = id;
        this.name = name;
        this.password = password;
        this.balance = balance;
  }


    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
      this.balance = balance;
    }
}
