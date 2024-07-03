package java_23_5_2024;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public int mul(int a, int b){
        return a * b;
    }

    public float div(int a, int b) throws Exception,ArithmeticException {
        if(b==0){
            throw new Exception("Division by zero");
        }

        if(b==-1){
            throw new ArithmeticException("Please input argument != -1");
        }
        return a/b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        try{
            c.div(1,0);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
