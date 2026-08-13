public class Manager extends Approver {
    @Override protected boolean canApprove(ExpenseRequest r) { return r.amount() <= 10_000; }
    @Override protected String title() { return "Manager"; }
}
