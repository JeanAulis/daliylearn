import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("please enter a number(100~999):");
        int number = sc.nextInt();
        int number1 = number / 100;
        System.out.println("百位数为" + number1);
        int number2 = number % 100 / 10;
        System.out.println("十位数为" + number2);
        int number3 = number % 100 % 10;
        System.out.println("个位数为" + number3);
    }
}
