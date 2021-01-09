package automation.training.fundamentals.maintask;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x: array) {
            System.out.println(x);
        }
        for (int x : array) {
            System.out.print(x);
        }
    }
}
