package practice02;

/**
 * @Description array2_stone
 * @Author jeanAulis
 * @Date 2025-07-06
 */
public class array2_stone {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        int num = 1;
        // 遍历生成数据
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num++;
            }
            arr[3][3] = 0;
        }
        print(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int row = (int)(Math.random() * arr.length);
                int col = (int)(Math.random() * arr.length);
                int temp = arr[i][j];
                arr[i][j] = arr[row][col];
                arr[row][col] = temp;
            }
        }
        System.out.println();
        print(arr);
    }



    public static void print(int[][] numbers){
        for (int i = 0; i < numbers.length; i++) {
            //遍历列
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]==0){
                    System.out.print("   ");
                }else {
                    System.out.printf("%3d", numbers[i][j]);
                }
            }
            System.out.println();
        }
    }
}
