package day09_24;

// 需求:求1-100内的和
public class Demo01Array {
  public static void main(String[] args) {

    int total = 0;
    for (int i = 0; i <= 100; i++) {
      total += i;
    }
    System.out.println("100以内数字的和为:" + total);
  }
}
