package com.mao.homework.month10.day03;

/**
 * 1:多次生成随机数,并打印第一次出现大于0.999 时的次数与生成的随机数
 * Math.random() 方法可以生成 0到1之间的随机值
 */
public class HomeWork1 {
    public static void main(String[] args){
        int i=0;
        double k;
        while(true) {
            i++;
            k= Math.random();
            if (k>0.999) {
                System.out.println("次数"+i+"随机数"+k);
                break;
            }
        }

    }
}
