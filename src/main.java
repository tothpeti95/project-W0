package src;

public class main {
    public static void main(String[] args) {
        count(28);
        future(10);
        greet("Fogas Marci");
        cheer("Greetings");
    }

    public static void count(int age){
        System.out.println(age);
    }

    public static void future(int month){
        if(month == 10){
            System.out.println("Mérleg");
        }else {
            System.out.println("Fém ló");
        }
    }


    public static void greet(String name) {
        System.out.println("Greetings!");
    }

    public static void cheer(String size){
        System.out.println(size);
    }
}
