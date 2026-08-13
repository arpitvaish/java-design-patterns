/** Fills in just the steps that differ for tea. */
public class Tea extends Beverage {
    @Override protected void brew()          { System.out.println("Steeping the tea"); }
    @Override protected void addCondiments() { System.out.println("Adding lemon"); }
}
