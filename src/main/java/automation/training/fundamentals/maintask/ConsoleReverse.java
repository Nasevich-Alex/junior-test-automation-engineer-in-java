package automation.training.fundamentals.maintask;

public class ConsoleReverse {
    public static void main(String[] args) {
        for (int i = args.length - 1; i < args.length && i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}
