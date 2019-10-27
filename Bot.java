import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bot {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello! My name is Bot.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");
        String string = reader.readLine();
        System.out.println("What a great name you have, " + string + " !");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        String age = reader.readLine();
        char[] chars = age.toCharArray();
        int ageFinish = ( (chars[0] - '0') * 70 + (chars[2] - '0') * 21 + (chars[4] - '0') * 15) % 105;
        System.out.println("Your age is " + ageFinish + "; that's a good time to start programming!");
    }
}