package bankWithGenerics;

public class Gold extends BankInstrument implements Asset{
    public Gold(int amount) {
        super(amount);
        nameOfInstrument = "Gold";
    }

    public String trendOnMarket() {
        String s = " Price of gold is rising";
        return s;
    }
}
