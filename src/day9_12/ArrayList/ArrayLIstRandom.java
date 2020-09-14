package day9_12.ArrayList;

import java.util.ArrayList;
import java.util.Random;

// 需求: 产生1-33的随机数字装入集合中,并遍历集合
public class ArrayLIstRandom {
  public static void main(String[] args) {
    Random r = new Random();
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 6; i++) {
      int num = r.nextInt(100033) + 1;
      list.add(num);
    }
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
