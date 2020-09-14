package day9_12.ArrayList;

import java.util.ArrayList;

public class Demo2ArrayEach {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("狄仁杰");
    list.add("李元芳");
    list.add("胡锦辉");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
