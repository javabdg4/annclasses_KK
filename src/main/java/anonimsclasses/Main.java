package anonimsclasses;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Main {

    public interface ButtonT {
        void click();

//        void mouseOn();
    }

    public static void action() {
        ButtonT buttonT = new ButtonT() {

            public void click() {
                System.out.println("przycisk klikniety");
            }

//            public void mouseOn() {
//                System.out.println("mysza poruszona");
//            }
        };
        buttonT.click();

    }

    public static void main(String[] args) {
        ButtonT buttonT = () -> System.out.println("Przycisk klikniety");
        buttonT.click();
        Runnable t1=new Runnable() {
            @Override
            public void run() {
                System.out.println("jestem w nowym watku");
            }
        };
        t1.run();

        Runnable r1 =() -> System.out.println("lambda watek");
        r1.run();
        //w interfejsie jedna metoda
        // <lista parametrów> -> <ciało wyrażenia>

        Button btn=new Button();
        btn.setText("Test");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("przycisk został klikniety");
            }
        });
    }
}
