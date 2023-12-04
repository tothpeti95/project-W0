package src;

public class main {
    public static void main(String[] args) {
        count(28);
        future(10);
        cheer();
    }

    public static void count(int age){
        System.out.println(age);
    }

    public static void future(int month){
        if(month == 10){
            System.out.println("Mérleg");
        }else {
            System.out.println("Nem mérleg");
        }
    }

    public static void cheer(int size){
        System.out.println(size);
    }
}
