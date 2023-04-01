package com.atguigu.module;

/**
 * ClassName: HelloModule
 * Package: com.atguigu.module
 * Description:
 *
 * @Author kurt
 * @Create 2022 /12/21 下午 08:44
 * @Version v1.0
 */
public class HelloModule {

    public static void main(String[] args) {
        System.out.println("Hello,module!");
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i1==i2);
        System.out.println(i3==i4);
    }

}
