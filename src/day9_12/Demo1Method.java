package day9_12;

public class Demo1Method {
  public static void main(String[] args) {
    // 面向对象语言三大特性: 继承 封装 多态
    int[] arr = {1, 2, 3, 45, 6, 7, 2000};
    int result = getMax(arr);
    System.out.println("最大值是:" + result);

  }

  // 封装一个获取最大值的函数
  public static int getMax(int[] array) {
    int max = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }
}
