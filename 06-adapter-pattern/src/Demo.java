/**
 * Demo: the app only knows PaymentProcessor. Whether it's a modern Stripe
 * processor or a legacy bank behind an adapter, the calling code is identical.
 */
public class Demo {

    // Client code depends ONLY on the target interface.
    static void checkout(PaymentProcessor processor) {
        processor.pay("USD", 49.99);
    }

    public static void main(String[] args) {
        System.out.println("=== Modern provider (no adapter) ===");
        checkout(new StripeProcessor());

        System.out.println("\n=== Legacy provider (via adapter) ===");
        PaymentProcessor adapted = new LegacyBankAdapter(new LegacyBankGateway());
        checkout(adapted);   // same call — the adapter translates underneath

        System.out.println("\nAdapter handles other currencies too:");
        adapted.pay("INR", 1500.00);
    }
}
