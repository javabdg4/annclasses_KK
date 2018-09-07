package anonimsclasses;

public class Main {

   public interface Button{
       void click();
       void mouseOn();
    }

    public static void action(){
        Button button=new Button() {
            public void click() {
                System.out.println("przycisk klikniety");
            }

            public void mouseOn() {
                System.out.println("mysza poruszona");
            }
        };
        button.click();
        button.mouseOn();
    }
    public static void main(String[] args) {

    }
}
