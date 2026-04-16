package CompositePattern;

public class Main {
    public static void main(String[] args) {

        Manager m1 = new Manager("Alice");
        Manager m2 = new Manager("Bob");

        Salesperson s1 = new Salesperson("John", m1);
        Salesperson s2 = new Salesperson("Emma", m2);

        SalesTeam team1 = new SalesTeam(m1, s1);
        SalesTeam team2 = new SalesTeam(m2, s2);

        SalesTeam company = new SalesTeam(team1, team2);

        System.out.println("Pay all employees:");
        company.payExpenses(1000);
    }
}
