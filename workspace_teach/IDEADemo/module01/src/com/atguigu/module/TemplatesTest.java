package com.atguigu.module;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ClassName: TemplatesTest
 * Package: com.atguigu.module
 * Description:
 *
 * @Author kurt
 * @Create 2022/12/21 下午 10:20
 * @Version v1.0
 */
public class TemplatesTest {

    private static String string;

    //5. 靜態常量的聲明

    //psf
//    public static final

    //psfi
//    public static final int

    //psfs
//    public static final String

    //prsf
//    private static final

    public static void main(String[] args) {
        //1. 非空判斷
        String str = "hello";
        //str.nn
        if (str != null) {

        }
        //str.null
        if (str == null) {

        }
        //ifn
        if (str == null) {

        }
        //inn
        if (str != null) {

        }

        //2. 遍歷數組
        int[] arr = new int[]{1,2,3,4};
        //一般的for : fori
//        for (int i = 0; i < ; i++) {
//
//        }
        
        //增強for循環: for
        //arr.for
        for (int i : arr) {
            
        }
        //倒序的遍歷: forr
        //arr.forr
        for (int i = arr.length - 1; i >= 0; i--) {

        }

        //iterator : iter
        for (int i : arr) {

        }

        ArrayList list = new ArrayList();
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.for
        for (Object o : list) {

        }
        //list.iter
        for (Object o : list) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //3. 輸出語句
        //sout
        System.out.println("123");

        //soutm   method name
        System.out.println("TemplatesTest.main");

        //soutp
        System.out.println("args = " + Arrays.toString(args));

        int num = 10;
        //soutv  把最近的變量輸出
        System.out.println("num = " + num);


        //"hello".sout
        System.out.println("hello");

        //"hello".soutv
        System.out.println("\"hello\" = " + "hello");

        //num.soutv
        System.out.println("num = " + num);

        //4. 對象操作
        String str3 = new String();
        //String().new.var
        String s = new String();

        //new String(); 反白後alt+enter 選introduce local variable
        String s1 = new String();

        //new String(); ctrl+alt+v  也可以
        String s2 = new String();

        //new String().new.field  但他會在上面生成一個靜態變量
        string = new String();

        Object obj = new String();

        //obj.cast.var   強轉型
        String obj1 = (String) obj;

        //自定義代碼模板  Integer.list   XXX.list都可
        ArrayList<Integer> list1 =new ArrayList<>();

        //Double.list
        ArrayList<Double> list2 =new ArrayList<>();

        //自定義Live Templates 中的CustomerDefine -> sop
        //sop
        System.out.print(123);

    }

    //自定義單元測試模板 Live Templates 中的CustomerDefine -> test
    @Test
    public void test1(){

    }

    @Test
    public void test2(){
        System.out.println("hello");
    }
}
