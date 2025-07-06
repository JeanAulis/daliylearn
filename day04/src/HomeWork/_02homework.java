package HomeWork;

/**
 * @Description _02homework
 * @Author jeanAulis
 * @Date 2025-07-06
 */
public class _02homework {
    public static void main(String[] args) {

        // 需求:
        // 现有一个整数数组{100,50,90,60,80,70}。
        // 请编写代码，计算数组中的所有元素的和并打印。
        int[] arr = {100, 50, 90, 60, 80, 70};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        // 需求:
        // 现有一个整数数组{100,50,90,60,80,70}。
        // 请编写代码，计算数组中的所有元素的最小值, 最大值并打印。
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

        // 需求:
        // 现有一个整数数组{100,50,90,60,80,70}。
        // 请编写程序，计算去掉最大值和最小值后的平均值（不考虑小数部分）
        double average = 0;
        System.out.println((sum - max - min) / (arr.length - 2));
    }
}
