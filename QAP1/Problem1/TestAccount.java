public class TestAccount {
    public static void main(String[] args) {
        Account Acc1 = new Account("Acc1", "Ichi", 5000);
        Account Acc2 = new Account("Acc2", "Ni", 4000);
        System.out.println("Before transfer");
        System.out.println(Acc1.getBalance());
        System.out.println(Acc2.getBalance());

        Acc1.transferTo(Acc2, 1000);

        System.out.println("\nAfter transfer");
        System.out.println(Acc1.getBalance());
        System.out.println(Acc2.getBalance());
    }
    
}
