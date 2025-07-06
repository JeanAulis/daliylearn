package practice01;

public class isPrime {
    private int num;
    static int sum = 0;
    public static void main(String[] args) {
        System.out.println("100-200之间的素数有：");
        for (int i = 101; i < 200; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                sum++;
            }
        }
        System.out.println("素数的个数为：" + sum);

    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
