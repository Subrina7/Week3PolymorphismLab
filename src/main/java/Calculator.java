public class Calculator extends Stationary {

    private boolean solar;

    public Calculator(String name, String colour, double price, boolean solar) {
        super(name, colour, price);
        this.solar = solar;
    }

    public boolean isSolar(boolean b) {
        return this.solar;
    }


    public String addBattery() {
        if (this.solar == true) {
            return "No battery needed";
        }
        return "Battery added";
    }






}

