/**
 * Uses the HOOK to skip condiments entirely — same skeleton, customized.
 * (addCondiments is still required by the abstract class, but never called.)
 */
public class BlackCoffee extends Beverage {
    @Override protected void brew()          { System.out.println("Dripping coffee through filter"); }
    @Override protected void addCondiments() { System.out.println("(no condiments)"); }
    @Override protected boolean wantsCondiments() { return false; }   // veto the optional step
}
