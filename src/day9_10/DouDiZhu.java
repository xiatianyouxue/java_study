package day9_10;

import java.util.*;

public class DouDiZhu {
    public static void main(String[] args) {
        // 1.准备牌
        HashMap<Integer, String> poker = new HashMap<>();
        // 2.创建一个list集合,来存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        // 2.1定义两个集合来存储花色和牌的序号
        List<String> colors = Arrays.asList("♥", "♠", "♦", "♣");
        List<String> numbers = Arrays.asList("2", "A", "K", "Q", "J", "3", "4", "5", "6", "7", "8", "9", "10");
        // 吧大王和小王存储到集合中
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }
//        System.out.println(poker);
//        System.out.println(pokerIndex);
        // 3. 洗牌
//        Collections.shuffle(pokerIndex);
        // 4. 发牌---定义4个集合,三个玩家和地主的牌
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        // 遍历存储索引的list集合,获取每一个索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            // 先判断底牌
            if (i >= 51) {
                // 开始发底牌了
                diPai.add(in);
            } else if (i % 3 == 0) {
                player1.add(in);
            } else if (i % 3 == 1) {
                player2.add(in);
            } else {
                player3.add(in);
            }
        }
        Collections.sort(diPai);
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        // 调用看牌的方法

        lookPoker("刘德华", poker, player1);
        lookPoker("张学友", poker, player2);
        lookPoker("郭富城", poker, player3);
        lookPoker("地主", poker, diPai);
    }

    // 定义一个看牌的方法
    public static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        System.out.print(name + ":");
        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value + ":");
        }
        System.out.println();
    }
}
