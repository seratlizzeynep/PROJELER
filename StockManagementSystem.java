import java.util.Scanner;

public class StockManagementSystem {
    private static final Product[] stock = new Product[100];
    private static int productCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1: Add a product to the stock");
            System.out.println("2: Display all products in the stock");
            System.out.println("3: Search for a product by name");
            System.out.println("4: Update a product's type");
            System.out.println("5: Update a product's producer");
            System.out.println("6: Exit the program");
            System.out.print("\nEnter the choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    displayAllProducts();
                    break;
                case 3:
                    searchProductByName(scanner);
                    break;
                case 4:
                    updateProductType(scanner);
                    break;
                case 5:
                    updateProductProducer(scanner);
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
        scanner.close();
    }

    private static void addProduct(Scanner scanner) {
        System.out.print("Enter the product's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the product's producer: ");
        String producer = scanner.nextLine();
        System.out.print("Enter the product's type: ");
        String type = scanner.nextLine();
        System.out.print("Enter the product's serial number: ");
        String serialNumber = scanner.nextLine();

        stock[productCount++] = new Product(name, producer, type, serialNumber);
        System.out.println("Product added successfully.");
    }

    private static void displayAllProducts() {
        if (productCount == 0) {
            System.out.println("No products in stock.");
            return;
        }
        for (int i = 0; i < productCount; i++) {
            stock[i].displayProductInfo();
        }
    }

    private static void searchProductByName(Scanner scanner) {
        System.out.print("Enter the name to search for: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < productCount; i++) {
            if (stock[i].nameMatches(name)) {
                stock[i].displayProductInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The product could not be found.");
        }
    }

    private static void updateProductType(Scanner scanner) {
        System.out.print("Enter the serial number of the product: ");
        String serialNumber = scanner.nextLine();

        Product product = findProductBySerialNumber(serialNumber);
        if (product != null) {
            System.out.print("Enter the new type: ");
            String newType = scanner.nextLine();
            product.updateType(newType);
            System.out.println("Product type updated successfully.");
        } else {
            System.out.println("Product with the given serial number could not be found.");
        }
    }

    private static void updateProductProducer(Scanner scanner) {
        System.out.print("Enter the serial number of the product: ");
        String serialNumber = scanner.nextLine();

        Product product = findProductBySerialNumber(serialNumber);
        if (product != null) {
            System.out.print("Enter the new producer: ");
            String newProducer = scanner.nextLine();
            product.updateProducer(newProducer);
            System.out.println("Product producer updated successfully.");
        } else {
            System.out.println("Product with the given serial number could not be found.");
        }
    }

    private static Product findProductBySerialNumber(String serialNumber) {
        for (int i = 0; i < productCount; i++) {
            if (stock[i].getSerialNumber().equals(serialNumber)) {
                return stock[i];
            }
        }
        return null;
    }
}
