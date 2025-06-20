import java.util.Arrays;
import java.util.Comparator;

public class Main {

    // Product class to represent items
    static class Product {
        int productId;
        String productName;
        String category;

        public Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }
    }

    // Linear Search based on product name
    public static int linearSearch(Product[] products, String targetName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(targetName)) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search based on product name (array must be sorted)
    public static int binarySearch(Product[] products, String targetName) {
        // Sort the array before performing binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);

            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    // Main method to test both search algorithms
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Camera", "Electronics"),
            new Product(105, "Bag", "Travel")
        };

        String searchTarget = "Watch";

        // Linear Search
        int linearResult = linearSearch(products, searchTarget);
        if (linearResult != -1) {
            System.out.println("Found using Linear Search: " + products[linearResult].productName);
        } else {
            System.out.println("Product not found using Linear Search");
        }

        // Binary Search
        int binaryResult = binarySearch(products, searchTarget);
        if (binaryResult != -1) {
            System.out.println("Found using Binary Search: " + products[binaryResult].productName);
        } else {
            System.out.println("Product not found using Binary Search");
        }
    }
}
