package com.wxmp;

/**
 * @author xunbo.xu
 * @desc    测试类目
 * @date 18/3/7
 */
public class Test {

    public static void main(String[] args){

        String s = "a$s$c";
        String result = s.replaceAll("[$]", "d");

        System.out.print(result);
    }

}
