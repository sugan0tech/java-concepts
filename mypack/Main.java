package mypack;

// importing package classes
import mypack.Protected;
// import mypack.Private; // only accessible within class
import mypack.Default; // only accessible withing package

public class Main {
    public static void main(String args[]) {
        Default.def();
        System.out.println("From Main package " + new Protected().value);
    }

}
