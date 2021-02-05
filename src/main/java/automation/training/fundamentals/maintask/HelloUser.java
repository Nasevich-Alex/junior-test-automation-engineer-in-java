package automation.training.fundamentals.maintask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloUser {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userName = reader.readLine();
        System.out.println("Hello " + userName + "!");
    }
}
