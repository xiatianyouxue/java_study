package day9_10;

public class demo4Person {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "李坤";
        one.showName();
        // 匿名对象
        new Person().name = "宋婷"; // new一次就创建了一个对象
        new Person().showName(); // 匿名对象只能使用唯一的一次,下次使用需要再创建
    }
}
