import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int original = num;
        int remainder;
        int result = 0;

        while(original != 0)
        {
            remainder = original % 10;
            result = result + remainder * remainder * remainder;
            original = original / 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}