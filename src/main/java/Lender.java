public class Lender {
    private String id;
    private double funds;

    Lender(){}

    Lender(String id, double funds) {
        this.id = id;
        this.funds = funds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

}
