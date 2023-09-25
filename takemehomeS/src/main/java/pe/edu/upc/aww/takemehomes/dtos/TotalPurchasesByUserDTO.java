package pe.edu.upc.aww.takemehomes.dtos;

public class TotalPurchasesByUserDTO {

    private String name;

    private int totalPurchases;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPurchases() {
        return totalPurchases;
    }

    public void setTotalPurchases(int totalPurchases) {
        this.totalPurchases = totalPurchases;
    }
}
