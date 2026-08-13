/**
 * ADAPTEE — an old library we can't change. Its interface is incompatible:
 *  - amount is an integer number of "minor units" (paise/cents)
 *  - currency is an int code, not a String
 *  - the method name and signature are totally different
 */
public class LegacyBankGateway {
    public void executeTransaction(int minorUnits, int currencyCode) {
        System.out.println("LegacyBank: executed txn of " + minorUnits
                + " minor units, currencyCode=" + currencyCode);
    }
}
