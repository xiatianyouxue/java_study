package day9_10.ArrayList;

import java.util.ArrayList;

public class Demo2ArrayMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean success = list.add("宋婷");
        list.add("李坤");
        System.out.println(success);
        // 获取元素
        String name = list.get(1);
        System.out.println(name);
        // 移除元素
        String whoRemoved  = list.remove(1);
        System.out.println(whoRemoved); // 返回值是被删除的元素
    }
}
