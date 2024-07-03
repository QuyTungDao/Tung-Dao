package java_14_5_2024;

public class Computer implements IComputer, ISoftware {
    @Override
    public void turnOn(){
        System.out.println("Turn on!!!");
    }

    @Override
    public void turnOff(){
        System.out.println("Turn off!!!");
    }

    @Override
    public void install(){
        System.out.println("Install!!!");
    }

    @Override
    public void uninstall(){
        System.out.println("Uninstall!!!");
    }
}
