
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

        if (searchProduct(product.name) != null || maxNumberOfProducts == numberOfProducts) {
            return false;
        } else {
            products[numberOfProducts++] = product;
            return true;
        }
    }

    public Product searchProduct(String productName) {
        if (numberOfProducts == 0) {
            return null;
        }
        for (int i = 0; i < numberOfProducts; i++) {
            if (productName.equals(products[i].name)) {
                return products[i];
            }
        }
        return null;
    }


    public boolean deleteProduct(String productName) {
        for (int i = 0; i < numberOfProducts; i++) {
            if (products[i].name.equals(productName)) {
                numberOfProducts--;
                for (int j = i; j < numberOfProducts; j++) {
                    products[j] = products[j + 1];
                }
                products[numberOfProducts] = null;
                return true;
            }
        }
        return false;

    }
}