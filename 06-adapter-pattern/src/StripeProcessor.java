/** A modern provider that already speaks our interface — no adapter needed. */
public class StripeProcessor implements PaymentProcessor {
    @Override
    public void pay(String currency, double amount) {
        System.out.printf("Stripe: charged %.2f %s%n", amount, currency);
    }
}
