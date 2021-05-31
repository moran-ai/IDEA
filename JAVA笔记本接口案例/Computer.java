package JAVA笔记本接口案例;

public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }

    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }

    // 笔记本电脑使用USB接口
    public void useUsb(USB usb){
        usb.open();  // 打开设备
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;  // 向下转型
            mouse.clik();
        } else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;  // 向下转型
            keyboard.type();
        }
        usb.close();  // 关闭设备
    }
}
