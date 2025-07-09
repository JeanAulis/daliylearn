package com.itheima.static_test1;

/**
 * @Description static4test
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class static4test {


    public static void main(String[] args) {
        User u1 = new User();

        System.out.printf("直播间在线人数：%d \n",User.count);

        User u2 = new User();

        System.out.printf("直播间在线人数：%d \n",User.count);


        User u3 = new User();

        System.out.printf("直播间在线人数：%d \n",User.count);



    }
}
