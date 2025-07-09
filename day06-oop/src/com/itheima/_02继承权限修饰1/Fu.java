package com.itheima._02继承权限修饰1;

/**
 * @Description Test
 * @Author jeanAulis
 * @Date 2025-07-09
 */
public class Fu {

    private void testPrivate(){}
    void testDefault(){}

    protected void testProtected(){}
    public void testPublic(){}

    public void test() {
        testPrivate();
        testDefault();
        testProtected();
        testPublic();
    }
}
