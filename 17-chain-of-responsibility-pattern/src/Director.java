public class Director extends Approver {
    @Override protected boolean canApprove(ExpenseRequest r) { return r.amount() <= 100_000; }
    @Override protected String title() { return "Director"; }
}
