package JAVAbasico4;

public class SmartWatch extends SmartDevice {

    boolean waterResistant;

    public SmartWatch (){
    }

    public SmartWatch(String colour, Double price, int memory, boolean waterResistant) {
        super(colour, price, memory);
        this.waterResistant = waterResistant;
    }
}

