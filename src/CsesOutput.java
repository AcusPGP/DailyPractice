import java.util.Scanner;

public class CsesOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Ban đầu: " + num);
        int reverseNum = 0;
        while (num != 0) {
            int temp = num % 10;
            reverseNum = reverseNum * 10 + temp;
            num = num / 10;
        }
        System.out.println("Lúc sau: " + reverseNum);
    }
}
