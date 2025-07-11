public class Demo04 {
    public static void main(String[] args){
        int x = 15;
        int y = ++x + x-- - x++ + --x - x--; // //int y=16+16-15+15-15;
        System.out.println(x);
        System.out.println(y);
    }
}
