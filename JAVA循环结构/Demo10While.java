package JAVA循环结构;

/*
while循环标准格式：
    初始化语句;
	while (条件判断){
		循环体;
	}

while循环扩展格式：
	初始化语句;
	while (条件判断){
		循环体;
		步进语句;
	}

*/
public class Demo10While{
    public static void main(String[] args){
        int i = 1;  // 初始化语句
        while (i <= 10){   // 判断条件
            System.out.println("哈哈！" + i); // 循环体
            i++;  // 步进表示式
        }
        System.out.println("================");
        for (int a = 1; a <= 10; a++){
            System.out.println("e" + i);
        }
    }
}
