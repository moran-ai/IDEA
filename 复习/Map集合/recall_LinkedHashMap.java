package 复习.Map集合;

import java.util.LinkedHashMap;

/*
 java.util.LinkedHashMap extends Map
 */
public class recall_LinkedHashMap {
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        // 创建一个LinkedHashMap集合
        LinkedHashMap<String, String> link = new LinkedHashMap<>();
        link.put("1", "y");
        link.put("5", "a");
        link.put("3", "x");

        System.out.println(link);
    }
}
