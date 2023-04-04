public abstract class Stationary {

    public String name;
    public String colour;
    public double price;

    public Stationary(String name, String colour, double price ){
        this.name = name;
        this.colour = colour;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
