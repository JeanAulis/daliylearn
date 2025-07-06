package new_homework;

public class _08homework {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i < 10000; i++) {
            if ((i % 10 + i / 1000) == (i / 10 % 10 + i / 100 % 10)) {
                System.out.println(i);

                count++;
            }
        }
        System.out.println("个数为：" + count);
//        System.out.println("个位：" + (1234 % 10));
//        System.out.println("千位：" + (1234 / 1000));
//        System.out.println("百位：" + (1234 / 10 % 10));
//        System.out.println("十位：" + (1234 / 100 % 10));

    }
}
