package bank;

public class Bank {
    private String name = "Bank of India";
    private String ifcCode = "156FO2815";
    private String branch = "Kanti Muzaffarpur";

    public void bankDetails() {
        System.out.println("Bank name : " + name);
        System.out.println("Bank IFC Code : " + ifcCode);
        System.out.println("Bank Branch : " + branch);
    }
}
