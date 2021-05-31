package JAVA笔记本接口案例;

public class DemoMain {
    public static void main(String[] args) {
        // 创建一个笔记本类
        Computer computer = new Computer();
        computer.powerOn();  // 笔记本电脑开机

        // 对象向上转型
        USB usbMouse = new Mouse();  // 多态写法

        // 电脑使用鼠标,参数是usb类型
        computer.useUsb(usbMouse);

        // 创建一个笔记本键盘类
        Keyboard keyboard = new Keyboard(); // 没有使用多态写法
        // 参数是USB类型，传递进去的是实现类  会自动向上转型
        computer.useUsb(keyboard);  // 正确写法
        computer.useUsb(new Keyboard());  // 正确写法

        computer.powerOff();  // 笔记本电脑关机
    }



}
