package bankWithGenerics;

public class Securities extends BankInstrument implements Asset {
    public Securities(int amount) {
        super(amount);
    }

    public String trendOnMarket() {
        return null;
    }
}
