/** The request that travels down the chain. */
public class ExpenseRequest {
    private final int amount;
    private final String purpose;

    public ExpenseRequest(int amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
    }

    public int amount()    { return amount; }
    public String purpose(){ return purpose; }
}
