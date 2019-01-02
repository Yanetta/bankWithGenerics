package bankWithGenerics;

public class Securities extends BankInstrument implements Asset {
    public Securities(int amount) {
        super(amount);
        nameOfInstrument = "Securities";
    }

    public String trendOnMarket() {
        String s = " Price of securities is falling";
        return s;
    }
}

