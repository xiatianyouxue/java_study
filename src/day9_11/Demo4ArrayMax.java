package day9_11;

public class Demo4ArrayMax {
  public static void main(String[] args) {
    // 求数组中的最大值
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 7};
    // 先假设第一项是最大值
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
//        arr[i] = max;
        max = arr[i];
      }

    }
    System.out.println(max);
  }
}
