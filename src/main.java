package src;

public class main {
    public static void main(String[] args) {
        count(5);
        future(10);
        greet("Fogas Marci");
        cheer("damn","it");
    }

    public static void count(int number){
        System.out.println(number);
    }

    public static void future(int month){
        if(month == 10){
            System.out.println("Mérleg");
        }else {
            System.out.println("Fém ló bre");
        }
    }
    
    public static void greet(String name) {
        System.out.println("Greetings!");
    }

    public static void cheer(String language, String camel){
        System.out.println(language);
        System.out.println(camel);
    }
}
