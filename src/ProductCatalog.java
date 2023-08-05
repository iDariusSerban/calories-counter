public class ProductCatalog {

    Product[] products;

    static final int maxNumberOfProducts = 100;

    int numberOfProducts;

    public ProductCatalog() {
        this.products = new Product[maxNumberOfProducts];
        this.numberOfProducts = 0;
    }

    public void printProducts() {
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println(products[i].toString());
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
        for (int i = 0; i < products.length; i++) {
            if (product.name.equals(products[i].name)) {
                return true;
            }
        }
        return false;
    }

    public Product getProductByName(String name) {
        //cautam produsul in lista si il returnam
        for (int i = 0; i < products.length; i++) {
            //daca numele produsului este name returnam produsul
            if (products[i].name == name) {
                return products[i];
            }
        }
        return null;
    }

    public boolean deleteProduct(String name) {
        //cautam produsul dupa nume
        for (int i = 0; i < products.length; i++) {
            if (products[i].name == name) {
                //stergem produsul
                products[i] = null;
            } else {
                return false;
            }
        }
        return true;

    }
}