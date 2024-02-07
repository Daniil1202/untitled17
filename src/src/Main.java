package src;

import GenderType.Gender;

public class Main {
    static Buyer [] buyers = new Buyer[3];
    static Product[] products = new Product[7];

    public static void main(String[] args) throws BuyerException, ProductException {


        buyers[0] = new Buyer("Petr", "Petrov", 34, Gender.MALE);
        buyers[1] = new Buyer("Ivan", "Ivanov", 23, Gender.MALE);
        buyers[2] = new Buyer("Ekaterina", "Noskova", 26, Gender.FAMALE);


        products[0] = new Product("TV", 55.500);
        products[1] = new Product("Headphones", 15.800);
        products[2] = new Product("Phone", 40.500);
        products[3] = new Product("Computer", 120.000);
        products[4] = new Product("Laptop", 90.000);
        products[5] = new Product("Applewatch", 25.700);
        products[6] = new Product("Smartphone", 88.00);

        Shop.productPurchase(buyers[0],products[0]);
        Shop.productPurchase(buyers[1],products[5]);
        Shop.productPurchase(buyers[2], products[2]);
        System.out.println(Shop.getInfo());

    }


}






