/**
 * TARGET interface — what our modern app expects to call.
 * Clean, simple: pay an amount in a currency.
 */
public interface PaymentProcessor {
    void pay(String currency, double amount);
}
