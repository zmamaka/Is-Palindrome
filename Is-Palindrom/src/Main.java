import java.util.Scanner;

public class Main {

    static boolean isPalindrome(int x) {
        int tempNumber = x, reverseNumber = 0, lastNumber;

        while (tempNumber != 0){

            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tempNumber /= 10;

        }

        return reverseNumber == x;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı giriniz => ");
        int number = scan.nextInt();

        System.out.println(isPalindrome(number));

    }
}
