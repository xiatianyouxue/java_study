package day9_10;

import java.util.Scanner;

// 需求: 用户输入三个数字,比较三个数字的最大值
public class demo3ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字:");
        int c = sc.nextInt();
        int tem = a > b ? a : b;
        int max = tem > c ? tem : c;
        System.out.println("最大数字是:" + max);
    }
}
