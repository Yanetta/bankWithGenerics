package bankWithGenerics;

public class Bank <T extends Asset> {
    String bankName;
    String adress;
    T active;

    public Bank(String name, String adress, T active) {
        this.bankName = name;
        this.adress = adress;
        this.active = active;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getAdress() {
        return adress;
    }
    public void setName(String name) {
        this.bankName = name;
    }
    public String getName() {
        return bankName;
    }
    public void setActive(T active) {
        this.active = active;
    }
    public T getActive() {
        return active;
    }

    Asset appleStock = new BankInstrument(200) {
        public String trendOnMarket() {
            String s = "Price of Gasprom stocks is falling";
            System.out.println(appleStock.trendOnMarket());
            return s;
        }
    };
}
