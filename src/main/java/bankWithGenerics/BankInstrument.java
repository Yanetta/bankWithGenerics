package bankWithGenerics;

public abstract class BankInstrument implements Asset {
    String nameOfInstrument;
    private int amount;

    public BankInstrument(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String showBalance() {
        String s = " Your balance is: " + amount;
        return s;
    }

    public int paymentOperation(int amountToPay) {
        amount = amount - amountToPay;
        System.out.println("You spent: " + amountToPay + " the balance is: ");
        return amount;
    }

    public int receivementOperation(int receivedAmount) {
        amount = amount + receivedAmount;
        System.out.println("You received: " + receivedAmount + " the balance is: ");
        return amount;
    }

    public int changeToHryvnya(int kursToHryvnya) {
        System.out.println("In hryvnya your asset will cost: " + (amount * kursToHryvnya));
        return amount * kursToHryvnya;
    }

    @Override
    public String toString() {
        String s = "Your instrument is: " + "\n" + this.nameOfInstrument;
        return s;
    }
}


