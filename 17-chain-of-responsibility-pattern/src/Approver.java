/**
 * HANDLER — the base of the chain. Each approver holds a reference to the
 * NEXT approver. It either handles the request or passes it along. The sender
 * doesn't know (or care) who finally approves it.
 */
public abstract class Approver {
    protected Approver next;   // the next link in the chain

    public Approver linkTo(Approver next) {   // build the chain fluently
        this.next = next;
        return next;
    }

    // Template for the chain step: handle, or pass on.
    public final void handle(ExpenseRequest request) {
        if (canApprove(request)) {
            approve(request);
        } else if (next != null) {
            System.out.println("  " + title() + " can't approve $" + request.amount()
                    + " → escalating");
            next.handle(request);         // pass to the next handler
        } else {
            System.out.println("  ❌ No one could approve $" + request.amount());
        }
    }

    protected abstract boolean canApprove(ExpenseRequest request);
    protected abstract String title();

    private void approve(ExpenseRequest request) {
        System.out.println("  ✅ " + title() + " approved $" + request.amount()
                + " for " + request.purpose());
    }
}
