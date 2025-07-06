package practice02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5};
        int[] arr3 = new int[]{1,2,3,4,5};
        double arr4[] = new double[]{1.0,2.0,3.0,4.0,5.0};

        System.out.println("数组1的全部元素：" + Arrays.toString(arr1));
        System.out.println("数组2的长度：" + arr2.length);
        System.out.println("数组3的第一个元素：" + arr3[0]);
    }
}
