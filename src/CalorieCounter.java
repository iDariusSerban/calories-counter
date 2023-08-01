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

        int option = 0;

        do {
            printMenu();
            option = scanner.nextInt();
            performSelectedAction(option, productCatalog,scanner);

        }while (option!=6);
    }
    public static void printMenu (){

    }
    public static void performSelectedAction (int option, ProductCatalog productCatalog, Scanner scanner){
        switch (option){
            case 1:
                // cimim de la tastatura detaliile produsului
                // ne instantiem un produs cu aceste detalii -creem un obiect
                //pasam obiectul creat la metoda addProduct

                String name = scanner.nextLine();
                double fats = scanner.nextDouble();
                double carbs = scanner.nextDouble();
                double proteins = scanner.nextDouble();
                Product newProduct = new Product(name, fats, carbs, proteins);
                boolean result = productCatalog.addProduct(newProduct);

        }
    }
}
