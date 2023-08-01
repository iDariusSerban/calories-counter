public class ProductCatalog {

    Product[] products;

    static final int maxNumberOfProducts = 100;

    int numberOfProducts;

    public ProductCatalog() {
        this.products = new Product[maxNumberOfProducts];
        this.numberOfProducts = 0;
    }

    public void prinProducts(){
        //de completat
    }

    public boolean addProduct(Product product){
        return true;
    }

   public Product getProductByName (String name ){
        //cautam produsul in lista si il returnam
       return null;
   }

   public boolean deleteProduct (String name){
        //cautam produsul dupa nume
       //stergem produsul
       return true;
   }
}
