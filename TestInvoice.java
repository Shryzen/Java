public class TestInvoice {
    public static void main(String[] args) {
        Invoice inv = new Invoice("A-100", "USB-C Cable", 3, 12.50);
        System.out.println(inv); // uses toString()
        System.out.println("Total Payment: $" + inv.getPaymentAmount());
    }
}

