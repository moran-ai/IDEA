package JAVA循环结构;

/*
嵌套循环格式:
    for(初始化表达式[1];循环条件[2];步进表达式[7]){
        for(初始化表达式[3];循环条件[4];步进表达式[6]){
            执行语句[5];
        }
    }
执行顺序:[1][2][3][4][5][6] -->[4][5][6]-->[7][2][3][4][5][6]-->[4][5][6]
外循环一次，内循环多次
 */
public class DemoLoopQianTao {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++){  // 控制小时
            for (int minute=0; minute < 60; minute++){ // 控制分钟
                for (int s = 0; s < 60; s++){  // 控制秒
                    System.out.println(hour + "点" + minute + '分' + s + "秒");
                }

            }

        }
    }
}
