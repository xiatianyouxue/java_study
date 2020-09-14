package day9_12.Random;

import java.util.Random;
import java.util.Scanner;

// 需求: 猜数字游戏
// 系统随机产生一个数字,提示用户输入数字,如果猜小了,提示太小了,直至猜中为止
public class Demo4RandomGame {
  public static void main(String[] args) {
    //1. 随机产生一个是数字
    Random r = new Random();
    int randomNumber = r.nextInt(100) + 1;
    Scanner s = new Scanner(System.in);
    while (true) {
      //2.用户输入一个数字
      System.out.println("请输入一个数字:");
      int guessNum = s.nextInt();
      if (randomNumber > guessNum) {
        System.out.println("您输入的数字太小了,请重试");
      } else if (randomNumber < guessNum) {
        System.out.println("您输入的数字太大了,请重试:");
      } else {
        System.out.println("恭喜您!猜中了");
        break;
      }
    }
    System.out.println("游戏结束");
  }
}
