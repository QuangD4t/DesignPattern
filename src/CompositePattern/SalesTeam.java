package CompositePattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesTeam implements Payee {
    private List<Payee> members = new ArrayList<>();

    public SalesTeam(Payee... payees) {
        members.addAll(Arrays.asList(payees));
    }

    public void addMember(Payee payee) {
        members.add(payee);
    }

    @Override
    public void payExpenses(int amount) {
        for (Payee p : members) {
            p.payExpenses(amount); // gọi đệ quy
        }
    }
}
