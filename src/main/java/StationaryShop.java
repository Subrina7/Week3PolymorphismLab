import java.util.ArrayList;

public class StationaryShop {

    private String name;
    private ArrayList<Stationary> stock;
    private double till;

    public StationaryShop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = 0;
    }

    public int countStock(){
        return this.stock.size();
    }
    public void addStock(Stationary stationary){
        this.stock.add(stationary);
    }


    public double countValue(){
        //Loop over stock
        // for each item in stock, find price
        // add price to total
        double total = 0;
        for(Stationary item : this.stock){
            double itemPrice = item.getPrice();
            total += itemPrice;
        }
        return total;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Stationary> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Stationary> stock) {
        this.stock = stock;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }
}
