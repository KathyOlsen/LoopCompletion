import java.util.Scanner;

public class GetIntegers {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0, counter = 1;

        while (counter <=10){
            System.out.println("Please enter a number: ");
            num = keyboard.nextInt();
            total += num;
            counter++;
        }
        System.out.println("The total of all 10 numbers is " + total);
    }
}
