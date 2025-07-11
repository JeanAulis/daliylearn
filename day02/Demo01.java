public class Demo01 {
    public static void main(String[] args){
        int a = 10;
        double b = a;
        System.out.println(a);
        System.out.println(b);

        double c = 10;
        System.out.println("c" + c);

        byte num1 = 3;
        short num2 = 4;

        short num3 = (short)(num1 + num2);
        System.out.println("num3 = " + num3);

        double d = a + b;
        System.out.println("d = " + d);

        byte d1 = 3 + 4;
        System.out.println("d1 = " + d1);
    }
}