package JAVA集合;

import java.util.ArrayList;

public class DemoArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("赵丽颖");
        list.add("1");
        list.add("8");
        list.add("4");
        
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
