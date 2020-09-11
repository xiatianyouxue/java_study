package day9_10.ArrayList;

import java.util.ArrayList;

// 泛型: 装在集合的所有元素,全都是统一的类型
public class Demo1Array {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        // 向集合中添加数据
        list.add("赵丽因");
        list.add("赵丽因");
        list.add("赵丽因");
        System.out.println(list);
        // 其他常用方法
    }
}
