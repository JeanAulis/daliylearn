package practice02;

public class array_random {
    public static void main(String[] args) {
        String[] names = {"张三", "李四", "王五", "赵六", "孙七", "周八", "吴九", "郑十", "小王", "小李", "小张"};

        int index = (int)(Math.random() * names.length);

        System.out.println("随机点名人员：" + names[index]);
    }
}
