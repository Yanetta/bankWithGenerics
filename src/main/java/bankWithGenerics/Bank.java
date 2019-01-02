package bankWithGenerics;

public class Bank <T extends BankInstrument, E extends Asset> {
    private String bankName;
    private String adress;

    public Bank(String name, String adress) {
        this.bankName = name;
        this.adress = adress;
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

    public<T extends BankInstrument> void printAssetInfo(T asset){
        System.out.println(asset.toString());
    }
    public <T extends BankInstrument> void changeAssetToHryvnya(T asset, int kurs){
        System.out.println(asset.changeToHryvnya(kurs));
    }
    public<T extends Asset> void printAssetTrendOnMarket(T asset){
        System.out.println(asset.trendOnMarket());
    }
    public <T extends BankInstrument> void showAssetbalance(T asset){
        System.out.println(asset.showBalance());
    }
    public <T extends BankInstrument> void receiveAsset(T asset, int receivedAmount ){
        System.out.println(asset.receivementOperation(receivedAmount));
    }
    public <T extends BankInstrument> void spentAsset(T asset, int amountToPay){
        System.out.println(asset.paymentOperation(amountToPay));
    }
}
