package practice01;

import java.util.Scanner;

public class getCode {

    public int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入验证码长度：");
        int count = sc.nextInt();
        System.out.println(getCode(count));
//        System.out.println((int)(Math.random() * 3)); // 生成0-2的随机数
    }

    public static String getCode(int count){
        String code = "";

        for(int i = 0; i < count; i++){
            int type = (int)(Math.random() * 3);

            switch(type){
                case 0:
                    code += (char)(Math.random() * 26 + 'a');
                    break;
                case 1:
                    code += (char)(Math.random() * 26 + 'A');
                    break;
                case 2:
                    code += (int)(Math.random() * 10);
                    break;
            }
        }
        return code;
    }
}
