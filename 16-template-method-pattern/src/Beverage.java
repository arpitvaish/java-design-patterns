/**
 * The ABSTRACT class holds the TEMPLATE METHOD: prepareRecipe().
 * It fixes the ALGORITHM'S SKELETON (the steps + their order) and marks it
 * `final` so subclasses can't reorder it. Subclasses only fill in the steps
 * that vary (brew, addCondiments). Shared steps are implemented once here.
 */
public abstract class Beverage {

    // The template method — the skeleton. `final` = order is locked.
    public final void prepareRecipe() {
        boilWater();
        brew();               // varies
        pourInCup();
        if (wantsCondiments()) {   // a "hook" — optional step subclasses can veto
            addCondiments();       // varies
        }
        System.out.println("Done!\n");
    }

    // Shared steps — same for every beverage, written once.
    private void boilWater() { System.out.println("Boiling water"); }
    private void pourInCup() { System.out.println("Pouring into cup"); }

    // Steps that MUST vary — subclasses implement these.
    protected abstract void brew();
    protected abstract void addCondiments();

    // Hook — a default subclasses may override to customize the skeleton.
    protected boolean wantsCondiments() { return true; }
}
