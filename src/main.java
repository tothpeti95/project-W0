package src;

public class main {
    public static void main(String[] args) {
        count(5);
        future(10);
        greet("Fogas Marci");
        cheer("madzsar");
    }

    public static void count(int number){
        System.out.println(number);
    }

    public static void future(int randomNumber, String word){
        System.out.println(randomNumber + " " + word);
    }
    
    public static void greet(String name) {
        System.out.println("Greetings!");
    }

    public static void cheer(String language){
        System.out.println("Cheer for the " + language);
    }
}
