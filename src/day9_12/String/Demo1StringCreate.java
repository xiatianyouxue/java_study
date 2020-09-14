package day9_12.String;

public class Demo1StringCreate {
  public static void main(String[] args) {
    String str = "hello world";
    System.out.println(str);
    String str1 = "hello world";
    String str2 = "hello world";
    System.out.println(str1.equals(str2));
    String str3 = "Hello";
    String str4 = "hello";
    System.out.println(str3.equalsIgnoreCase(str4));  // 忽略大小写进行比较
  }
}
