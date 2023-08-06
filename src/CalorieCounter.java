import java.util.Scanner;

public class CalorieCounter {
    public static void main(String[] args) {
//MENIU:
//"1. Adauga produs in calculator si calculeaza-i caloriile"
//"2. Calculeaza caloriile pentru un produs fara a fi adaugat in catalog"
//"3. Afiseaza toate produsele din catalog si caloriile pentru fiecare"
// "4. Sterge un produs din catalog"
// "5. Gaseste produs dupa nume"
// "6. EXIT (Iesi din aplicatie)"
// "----------------------------------------------------------------”
//"Alege actiunea cu numarul:" ;

        ProductCatalog productCatalog = new ProductCatalog();
        Scanner scanner = new Scanner(System.in);
        Product product = new Product("apa", 5, 5, 5);
        productCatalog.addProduct(product);
        int option = 0;

        do {
            printMenu();
            option = scanner.nextInt();
            performSelectedAction(option, productCatalog, scanner);

        } while (option < 6 && option > 0);


    }

    public static void printMenu() {
        System.out.println("MENIU:");
        System.out.println("1. Adauga produs in calculator si calculeaza-i caloriile");
        System.out.println("2. Calculeaza caloriile pentru un produs fara a fi adaugat in catalog");
        System.out.println("3. Afiseaza toate produsele din catalog si caloriile pentru fiecare");
        System.out.println("4. Sterge un produs din catalog");
        System.out.println("5. Gaseste produs dupa nume");
        System.out.println("6. EXIT (Iesi din aplicatie)");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Alege actiunea cu numarul:");


    }

    public static void performSelectedAction(int option, ProductCatalog productCatalog, Scanner scanner) {
        switch (option) {
            case 1:
                // cimim de la tastatura detaliile produsului
                // ne instantiem un produs cu aceste detalii -creem un obiect
                //pasam obiectul creat la metoda addProduct
                productCatalog.addProduct(readProduct());
                break;
            case 2:
                Product product = readProduct();
                double calories = product.computeCalories(product.fats, product.carbs, product.proteins);
                System.out.println("Produsul are " + calories + " calorii");
                break;
            case 3:
                productCatalog.printProducts();
                break;
            case 4:
                System.out.println("ce produs doresti sa stregi?");
                if (productCatalog.deleteProduct()) {
                    System.out.println("Produsul a fost sters");
                } else {
                    System.out.println("Produsul nu a fost gasit");
                }
                break;
            case 5:
                System.out.println("ce produs cauti?");
                //  String searchedProduct = scanner.nextLine();
                System.out.println(productCatalog.getProductByName());
                break;
            default:
                System.out.println("Aplcatia s-a inchis");
        }
    }

    public static Product readProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numele produsului: ");
        String name = scanner.nextLine();
        System.out.println("Grasimi: ");
        double fats = scanner.nextDouble();
        System.out.println("Carbohidrati: ");
        double carbs = scanner.nextDouble();
        System.out.println("Proteine: ");
        double proteins = scanner.nextDouble();
        return new Product(name, fats, carbs, proteins);

    }
}
