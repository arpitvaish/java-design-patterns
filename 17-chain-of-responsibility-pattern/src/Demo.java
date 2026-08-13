/**
 * Demo: build the approval chain once, then fire requests at the FRONT of it.
 * Each request flows down until someone can approve it. The caller never
 * decides who approves — the chain does.
 */
public class Demo {
    public static void main(String[] args) {
        // Build the chain: TeamLead → Manager → Director
        Approver teamLead = new TeamLead();
        Approver manager  = new Manager();
        Approver director = new Director();
        teamLead.linkTo(manager).linkTo(director);

        int[][] requests = {
            {  500, 0 }, { 7_500, 0 }, { 85_000, 0 }, { 500_000, 0 }
        };
        String[] purposes = {
            "team lunch", "new laptops", "conference booth", "acquisition"
        };

        for (int i = 0; i < requests.length; i++) {
            ExpenseRequest req = new ExpenseRequest(requests[i][0], purposes[i]);
            System.out.println("Request: $" + req.amount() + " (" + req.purpose() + ")");
            teamLead.handle(req);   // always enter at the front of the chain
            System.out.println();
        }
    }
}
