package java_14_5_2024;

public class Button {
    public void onClick(EventListener eventListener){
        eventListener.onClickHandler();
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.onClick(new EventListener() {
            void onClickHandler(){
                System.out.println("Clicked");
            }
        });
    }
}
