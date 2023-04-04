public class Folder extends Stationary {

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

    public String addPlasticWallet(int numOfPlasticWallets) {
        return numOfPlasticWallets + " plastic wallets added ";
    }

    //
}

