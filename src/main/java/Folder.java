import Interface.IEngrave;

public class Folder extends Stationary implements IEngrave {

    private boolean compact;
    private String material;

    public Folder(String name, String colour, double price, boolean compact, String material) {
        super(name, colour, price);
        this.compact = compact;
        this.material = material;
    }

    public boolean isCompact() {
        return compact;
    }

    public String getMaterial() {
        return material;
    }

    public String addLabels() {
        return "Label added";
    }

    public void setCompact(boolean compact) {
        this.compact = compact;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String addPlasticWallet(int numOfPlasticWallets) {
        return numOfPlasticWallets + " plastic wallets added ";
    }

    public String addEngraving(String yourName){
        return "Engraving added for " + yourName;
    }

    //
}

