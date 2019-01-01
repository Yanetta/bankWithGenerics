package bankWithGenerics;

public class BankUse {
    public static void main(String[] args) {

        UsDollar dollar = new UsDollar(300);
        Bank<UsDollar> usDollarBank = new Bank<UsDollar>("USdollarBank", "Hreschatyk, 1", dollar);
        System.out.println(usDollarBank.active.toString());
        usDollarBank.active.changeToHryvnya(28);
        System.out.println(usDollarBank.active.paymentOperation(100));
        System.out.println(usDollarBank.active.receivementOperation(120));
        Gold gold = new Gold(5);
        Bank<Gold> goldBank = new Bank<Gold>("GoldBank", "Hreschatyk, 1", gold);
        System.out.println(goldBank.active.toString());
        goldBank.active.changeToHryvnya(1200);
        System.out.println(goldBank.active.paymentOperation(2));
        System.out.println(goldBank.active.receivementOperation(3));

        Securities securities = new Securities(700);
        Bank<Securities> securitiesBank = new Bank<Securities>("SecuritiesBank", "Hreschatyk, 1", securities);
        System.out.println(securitiesBank.active.toString());
        securitiesBank.active.changeToHryvnya(500);
        System.out.println(securitiesBank.active.paymentOperation(100));
        System.out.println(securitiesBank.active.receivementOperation(600));
    }
}
