package practice;

public class practice06 {
    public static void main(String[] args) {
//        第六题
//        身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
//        儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
//        女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
//        现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？


        int height_father = 177;
        int height_mother = 165;
        double height_son = (height_father + height_mother) * 1.08 / 2;
        double height_daughter = (height_father * 0.923 + height_mother) / 2;
        System.out.println("儿子身高为：" + height_son);
        System.out.println("女儿身高为：" + height_daughter);
    }
}
