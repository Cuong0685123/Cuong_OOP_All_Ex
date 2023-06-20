package bai10;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Product 1", null, 10.99);
        Product product2 = new Product("Product 2", null, 5.99);

        Invoice invoice = new Invoice();
        invoice.addLineItem(product1, 3);
        invoice.addLineItem(product2, 2);

        System.out.println("Invoice Details:");
        System.out.println("-----------------");
        System.out.println("Product\t\tQuantity\tPrice\t\tTotal");
        System.out.println("-----------------");
        for (LineItem lineItem : invoice.getLineItem()) {
            System.out.println(lineItem.calcTotalPrice() + "\t\t" +
                    lineItem.calcTotalPrice1() + "\t\t" +
                    ((Product) lineItem.getProduct()).getPrice() + "\t\t" +
                    lineItem.calcTotalPrice());
        }
        System.out.println("-----------------");
        System.out.println("Total Charge: " + invoice.calcTotalCharge());
    }
}
