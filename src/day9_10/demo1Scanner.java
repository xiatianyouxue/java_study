package day9_10;
import java.util.Scanner;
// 1. 导包
// 只有java.lang包下的不需要导入
// 2. 创建
// 3. 使用

public class demo1Scanner {
    public static void main(String[] args) {
        // 创建
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("您输入的数字是" + num);
    }
}
