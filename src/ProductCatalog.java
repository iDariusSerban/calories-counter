import java.util.Scanner;

public class ProductCatalog {

    Product[] products;

    static final int maxNumberOfProducts = 100;

    int numberOfProducts;

    public ProductCatalog() {
        this.products = new Product[maxNumberOfProducts];
        this.numberOfProducts = 0;
    }

    public void printProducts() {
        if (numberOfProducts == 0) {
            System.out.println("Lista este goala.");

        } else {
            for (int i = 0; i < numberOfProducts; i++) {
                System.out.println(products[i].toString());
            }
        }
    }

    public boolean addProduct(Product product) {

        if (isProductInList(product) || maxNumberOfProducts == numberOfProducts) {
            System.out.println("Produsul este deja in lista");
            return false;
        } else {
            products[numberOfProducts++] = product;
            System.out.println("Produsul a fost adaugat in lista");
            return true;
        }
    }

    public boolean isProductInList(Product product) {
        if (numberOfProducts == 0) {
            return false;
        }
        for (int i = 0; i < numberOfProducts; i++) {
            if (product.name.equals(products[i].name)) {
                return true;
            }
        }
        return false;
    }

    public Product getProductByName() {
        //cautam produsul in lista si il returnam
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < numberOfProducts; i++) {
            //daca numele produsului este name returnam produsul
            if (products[i].name.toString().equals(name)) {
                return products[i];
            } else {
                System.out.println("Produsul nu a fost gasit");
                return null;
            }
        }
        return null;
    }

    public boolean deleteProduct() {
        //cautam produsul dupa nume
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < numberOfProducts; i++) {
            if (products[i].name.toString().equals(name)) {
                //stergem produsul
                products[i] = null;
                numberOfProducts --;
                return true;
            }
        }
        return false;

    }
}