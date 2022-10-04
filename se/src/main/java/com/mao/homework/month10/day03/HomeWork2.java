package com.mao.homework.month10.day03;

import java.util.Scanner;

/**
 * 2:在三个方法中 分别使用 for while do while 写一个死循环
 * main方法 输入for  while  dowhile  调用对应方法
 */
public class HomeWork2 {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);//控制台输入
       int i = scanner.nextInt();
       if (i == 1){
           while1();
       } else if (i == 2) {
           dowhile();
       }else {
           for1();
       }
   }
   public static void while1(){
       System.out.println("while死循环");
       while(true){

       }
   }
   public static void dowhile(){
       System.out.println("dowhile死循环");
       do{

       }while(true);
   }
   public static void for1(){
       System.out.println("for死循环");
       for(int i=1;;i++){

       }
   }
}