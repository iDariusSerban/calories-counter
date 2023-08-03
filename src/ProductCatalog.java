public class ProductCatalog {

    Product[] products;

    static final int maxNumberOfProducts = 100;

    int numberOfProducts;

    public ProductCatalog() {
        this.products = new Product[maxNumberOfProducts];
        this.numberOfProducts = 0;
    }

    public void printProducts() {
        for (int i = 0; i < products.length; i++)
            if (products[i] != null) {
                System.out.println(products[i].name);
            } else {
                break;
            }

    }

    public boolean addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            // parcurg cu i tot sirul pana gasesc un loc liber
            // inserez noua valoare in locul liber

            if (products[i] == null) {   // not sure
                products[i] = product;
            } else {
                return false;
            }
        }
        return true;
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