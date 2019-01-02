package bankWithGenerics;

public class BankUse {
    public static void main(String[] args) {
        Bank<BankInstrument, Asset> bank = new Bank<BankInstrument, Asset>("Bank", "Hreschatyk, 1");

        UsDollar dollar = new UsDollar(300);
        bank.printAssetInfo(dollar);
        bank.showAssetbalance(dollar);
        bank.changeAssetToHryvnya(dollar, 28);
        bank.printAssetTrendOnMarket(dollar);
        bank.receiveAsset(dollar, 300);
        bank.spentAsset(dollar, 200);

        Gold gold = new Gold(5);
        bank.printAssetInfo(gold);
        bank.showAssetbalance(gold);
        bank.changeAssetToHryvnya(gold, 1200);
        bank.printAssetTrendOnMarket(gold);
        bank.receiveAsset(gold, 5);
        bank.spentAsset(gold, 3);

        Securities securities = new Securities(700);
        bank.printAssetInfo(securities);
        bank.showAssetbalance(securities);
        bank.changeAssetToHryvnya(securities, 1700);
        bank.printAssetTrendOnMarket(securities);
        bank.receiveAsset(securities, 20);
        bank.spentAsset(securities, 3);

    }
}
