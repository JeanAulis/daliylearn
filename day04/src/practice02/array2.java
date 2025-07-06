package practice02;

import java.util.Arrays;

/**
 * @Description 二维数组
 * @Author jeanAulis
 * @Date 2025-07-06
 */
public class array2 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int arr3[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr4 = new int[3][3];

        String arr5[][] = new String[3][2];
        arr5[0] = new String[]{"张无忌", "赵敏", "周芷若"};
        arr5[1] = new String[]{"张三丰", "宋远桥", "殷梨亭"};
        arr5[2] = new String[]{"灭绝", "陈昆", "玄冥二老", "金毛狮王"};
        arr5[2] = new String[]{"杨逍", "纪晓芙"};

        arr5[2][1] = "小昭";

        System.out.println(Arrays.toString(arr5[0]));

        System.out.println(arr5[1][2]);

        for (int i = 0; i < arr5.length; i++) {
            System.out.printf("第%d排：", i+1);

            for (int j = 0; j < arr5[i].length; j++) {
                System.out.print(arr5[i][j] + ",");
            }
            System.out.println();

        }
        String[][] arr6 = new String[3][5];
        String[][] arr7 = new String[3][];
        System.out.println();

        System.out.println(Arrays.toString(arr6));
        System.out.println(Arrays.toString(arr7));
        // System.out.println(arr7);
    }


}
