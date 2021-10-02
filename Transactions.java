package tamrin62;

public class Transactions {
    private TypeOfTransactions type;
    private MyDate date;
    private double amount;

    public Transactions(TypeOfTransactions type, MyDate date, double amount) {
        this.type = type;
        this.date = date;
        this.amount = amount;
    }

    public TypeOfTransactions getType() {
        return type;
    }

    public String toString() {
        return "Transactions{" +
                "type:" + type +
                ", date:" + date +
                ",amount:" + amount +
                "}";
    }
}
