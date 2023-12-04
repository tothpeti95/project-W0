package src;

public class main {
    public static void main(String[] args) {
        count(5);
        future(10);
        greet("Fogas Marci");
        cheer(6);
    }

    public static void count(int number){
        System.out.println(number);
    }

    public static void future(int month){
        if(month == 10){
            System.out.println("Mérleg");
        }else {
            System.out.println("Nem mérleg");
        }
    }


    public static void greet(String name) {
        System.out.println(name);
    }

    public static void cheer(int size){
        System.out.println(size);
    }
}
