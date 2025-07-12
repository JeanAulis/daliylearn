package com.itheima._05模版方法设计模式;

/**
 * @Description Demo06
 * @Author jeanAulis
 * @Date 2025-07-12
 */
public class Demo06 {
    public static void main(String[] args) {

        //创建歌手对象
        JayChou jayChou = new JayChou();
        HouseAdd7 houseAdd7 = new HouseAdd7();
        //让歌手表演
        System.out.println("-------Jaychou演唱---------");
        showTime(jayChou);
        System.out.println("-------马+7狗叫---------");
        showTime(houseAdd7);

    }

    public static void showTime(Singer singer){
        singer.sing();
    }
}
