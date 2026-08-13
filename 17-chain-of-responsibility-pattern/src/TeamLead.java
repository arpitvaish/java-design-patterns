public class TeamLead extends Approver {
    @Override protected boolean canApprove(ExpenseRequest r) { return r.amount() <= 1_000; }
    @Override protected String title() { return "Team Lead"; }
}
