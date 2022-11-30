package JAVAbasico4;

public class SmartPhone extends SmartDevice {

    String software;

    public SmartPhone() {
    }

    public SmartPhone(String colour, Double price, int memory, String software) {
        super(colour, price, memory);
        this.software = software;
    }
}
