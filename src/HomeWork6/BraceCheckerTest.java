package HomeWork6;

public class BraceCheckerTest {
    public static void main(String[] args) {
        // Խմբում մի քանի օրինակ՝
        BraceChecker bc1 = new BraceChecker("Hello from [Java]");
        System.out.print("Test1: ");
        bc1.check(); // All braces are properly matched.

        BraceChecker bc2 = new BraceChecker("Hello from [Java)");
        System.out.print("Test2: ");
        bc2.check(); // Error: opened [ but closed ) at 16

        BraceChecker bc3 = new BraceChecker(") starts with closing");
        System.out.print("Test3: ");
        bc3.check(); // Error: closed ) but not opened at 0

        BraceChecker bc4 = new BraceChecker("Missing [ bracket at the end [");
        System.out.print("Test4: ");
        bc4.check(); // Error: opened [ at ... but not closed

        // Մաքսիմում բարդ օրինակներ
        BraceChecker bc5 = new BraceChecker("{ [ ( ) ] }");
        System.out.print("Test5: ");
        bc5.check(); // All braces are properly matched.
    }
}


