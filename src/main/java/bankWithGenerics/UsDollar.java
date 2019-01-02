package bankWithGenerics;

public class UsDollar extends BankInstrument implements Asset {
    public UsDollar(int amount) {
        super(amount);
        this.nameOfInstrument = "US dollars";
    }

    public String trendOnMarket() {
        String s = " Price of dollar is rising";
        return s;
    }

}
