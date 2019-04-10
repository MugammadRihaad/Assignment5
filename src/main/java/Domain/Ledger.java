package Domain;

public class Ledger {

private String dateRecorded;
private double cash,accountsReceivable,inventory,investments,liability;

private Ledger(){}

private Ledger(Builder builder){
    this.dateRecorded=builder.dateRecorded;
    this.cash=builder.cash;
    this.accountsReceivable=builder.accountsReceivable;
    this.inventory=builder.inventory;
    this.investments=builder.investments;
    this.liability=builder.liability;
}
    public String getDateRecorded(){
        return dateRecorded;
    }

    public double getCash(){
        return cash;
    }

    public double getAccountsRecievable(){
        return accountsReceivable;
    }

    public double getInventory(){
        return inventory;
    }

    public double getInvestments(){
        return investments;
    }

    public double getLiability(){
        return liability;
    }

    public static class Builder{
    private String dateRecorded;
        private double cash,accountsReceivable,inventory,investments,liability;

        public Builder dateRecorded(String dateRecorded) {
            this.dateRecorded = dateRecorded;
            return this;
        }

        public Builder cash(double cash) {
            this.cash = cash;
            return this;
        }

        public Builder accountsRecievable(double accountsRecievable) {
            this.accountsReceivable = accountsRecievable;
            return this;
        }

        public Builder inventory(double inventory) {
            this.inventory = inventory;
            return this;
        }

        public Builder investments(double investments) {
            this.investments = investments;
            return this;
        }

        public Builder liability(double liability) {
            this.liability = liability;
            return this;
        }

        public Ledger build(){
            return new Ledger(this);
        }
    }

    @Override
    public String toString() {
        return "Ledger{" +
                "Date Recorded='" + dateRecorded + '\'' +
                ", Cash='" + cash + '\'' +
                ", Accounts Receivable='" + accountsReceivable + '\'' +
                ", Inventory='" + inventory + '\'' +
                ", Investment='" + inventory + '\'' +
                ", liability='" + liability + '\'' +
                '}';
    }

}
