package day09_24;

import java.util.Scanner;

// 需求:用书在键盘上输入一个数字,然后求1到这个数字的和
public class Demo2getSum {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
//    System.out.println(num);
    int total = 0;
    for (int i = 0; i < num; i++) {
      total += i;
    }
    System.out.println("1-" + num + "的和为:" + total);
  }
}
