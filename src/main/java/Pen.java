public class Pen extends Stationary{

    private boolean erasable;
    public Pen(String name, String colour, double price, boolean erasable){
        super(name, colour, price);
        this.erasable = erasable;
    }

    public boolean isErasable() {
        return erasable;
    }

    public void setErasable(boolean erasable) {
        this.erasable = erasable;
    }

    public String addEngraving(String yourName){
        return "Engraving added for " + yourName;
    }

    //ENGRAVING
    //MULTICOLOUR
}

