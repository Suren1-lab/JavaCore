package HomeWork;

public class Homewoek1 {
    public static void main(String[] args) {
        int x = 20;
        int y = 20;
        if (x > y) {
            System.out.println("x-ը մեծ է");
        }
        if (x < y) {
            System.out.println("y-ը մեծ է");
        }
        if (x == y){
            System.out.println("x և y հավասար են");
        }
        System.out.println("-------------");

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " ");

        }
        System.out.println();
        System.out.println("-------------");
        int a = 5;
        int b = 7;
        int c = a + b;
        System.out.println("a + b = " + c);
        System.out.println("-------------");
        int n = 3;
        for (int i = 0; i < 10; i++) {
            int k = i + 1;
            System.out.println(n + " * " + k + " = " + (n * k));

        }
    }
}
