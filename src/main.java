package src;

public class main {
    public static void main(String[] args) {
        count(5);
        future(10, "alma");
        greet("Marci", "hello");
        cheer("damn","it");
    }

    public static void count(int number){
        System.out.println(number);
    }


    public static void future(int randomNumber, String word){
        System.out.println(randomNumber + " " + word);
    }
    
    public static void greet(String a, String b) {
        System.out.println(a + " " + b);
    }

    public static void cheer(String language, String camel){
        System.out.println("Cheer for the " + language);
        System.out.println("Cheer for the " + camel);
    }
}
