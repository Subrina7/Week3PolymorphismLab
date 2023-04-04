import Interface.IEngrave;

public class Calculator extends Stationary implements IEngrave {

    private boolean solar;

    public Calculator(String name, String colour, double price, boolean solar) {
        super(name, colour, price);
        this.solar = solar;
    }



    public boolean isSolar() {
        return this.solar;
    }

    public void setSolar(boolean solar) {
        this.solar = solar;
    }

    public String addBattery() {
        if (this.solar == true) {
            return "No battery needed";
        }
        return "Battery added";
    }

    public String addEngraving(String yourName){
        return "Engraving added for " + yourName;
    }

    //overload..?
    public String addEngraving(String yourName, String studentID){
        return "Engraving added for " + yourName + ", student number: "+ studentID;
    }









}

