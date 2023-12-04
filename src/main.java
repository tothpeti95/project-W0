package src;

public class main {
    public static void main(String[] args) {
        count(5, 15);
        future(10);
        greet("Marci", "hello");
        cheer("madzsar");
    }

    public static void count(int number, int number2){
        System.out.println(number + number2);
    }

    public static void future(int month){
        if(month == 10){
            System.out.println("Mérleg");
        }else {
            System.out.println("Fém ló");
        }
    }
    
    public static void greet(String a, String b) {
        System.out.println(a + " " + b);
    }

    public static void cheer(String language){
        System.out.println(language);
    }
}
