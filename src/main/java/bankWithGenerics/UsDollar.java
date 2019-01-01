package bankWithGenerics;

public class UsDollar extends BankInstrument implements Asset {
    public UsDollar(int amount) {
        super(amount);
        this.nameOfInstrument = "US dollars";
    }

}
