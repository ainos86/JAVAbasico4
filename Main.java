package JAVAbasico4;

public class Main {
    public static void main(String[] args) {

        SmartDevice tablet = new SmartDevice("White",599.9,120);
        System.out.println (tablet.colour);
        System.out.println (tablet.price);
        System.out.println (tablet.memory);

        SmartPhone huawei = new SmartPhone("gold",395.2,32,"android");
        System.out.println (huawei.colour);
        System.out.println (huawei.price);
        System.out.println (huawei.memory);
        System.out.println (huawei.software);

        SmartWatch apple = new SmartWatch("black", 896.2, 24, true);
        System.out.println (apple.colour);
        System.out.println (apple.price);
        System.out.println (apple.memory);
        System.out.println (apple.waterResistant);
    }
}
