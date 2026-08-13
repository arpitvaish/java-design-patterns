/**
 * ADAPTER — implements the target interface the app expects, and translates
 * each call into what the legacy gateway actually understands.
 * The app talks clean; the mess is hidden in here.
 */
public class LegacyBankAdapter implements PaymentProcessor {

    private final LegacyBankGateway legacy;   // wraps the adaptee

    public LegacyBankAdapter(LegacyBankGateway legacy) {
        this.legacy = legacy;
    }

    @Override
    public void pay(String currency, double amount) {
        // Translate the modern call → the legacy call.
        int minorUnits = (int) Math.round(amount * 100);   // 49.99 → 4999
        int currencyCode = toCurrencyCode(currency);       // "USD" → 840
        legacy.executeTransaction(minorUnits, currencyCode);
    }

    private int toCurrencyCode(String currency) {
        switch (currency) {
            case "USD": return 840;
            case "INR": return 356;
            case "EUR": return 978;
            default: throw new IllegalArgumentException("Unsupported currency: " + currency);
        }
    }
}
