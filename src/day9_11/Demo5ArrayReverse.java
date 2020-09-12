package day9_11;

public class Demo5ArrayReverse {
  public static void main(String[] args) {
    // 数组翻转
    int[] array = {1, 2, 3, 4, 5, 6, 7};
//    int[] newArr = {};
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
    for (int min = 0, max = array.length - 1; min < max; min++, max--) {
      int temp = array[min];
      array[min] = array[max];
      array[max] = temp;
    }
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}
