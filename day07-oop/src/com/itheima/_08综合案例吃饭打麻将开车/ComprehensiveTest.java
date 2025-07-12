package com.itheima._08综合案例吃饭打麻将开车;

/**
 * @Description ComprehensiveTest
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class ComprehensiveTest {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        Worker worker = new Worker();
        Driver driver = new Driver();

        System.out.println("--------------");
        //请人吃饭
        restaurant(student);
        restaurant(teacher);
        restaurant(worker);
        restaurant(driver);

        System.out.println("--------------");
        //请人打麻将
        chessAndCardsRoom(student);
        chessAndCardsRoom(worker);

        System.out.println("--------------");
        //请人开车
        car(student);
        car(driver);
    }
    //模拟饭店让大家吃饭方法
    public static void restaurant(People people){
        people.eat();
    }

    //模拟棋牌室打麻将
    public static void chessAndCardsRoom(DaMaJiangAble daMaJiangAble){
        daMaJiangAble.playMaJiang();
    }

    //模拟汽车传入司机进行开车
    public static void car(DriveCarAble driverCarAble){
        driverCarAble.driverCar();
    }
}
