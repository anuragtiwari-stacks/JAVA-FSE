package Week_01.DSA.Ecommerce_Search_Function;

public class EcommerceSearchTest
{
    public static void main(String[] args)
    {
        Product[] products =
                {
                        new Product(101, "Laptop", "Electronics"),
                        new Product(102, "Mobile", "Electronics"),
                        new Product(103, "Shoes", "Fashion"),
                        new Product(104, "Watch", "Accessories"),
                        new Product(105, "Bag", "Fashion")
                };

        int targetId = 104;

        Product linearResult = LinearSearch.search(products, targetId);

        Product binaryResult = BinarySearch.search(products, targetId);

        System.out.println("Linear Search Result:");
        System.out.println(linearResult);

        System.out.println();

        System.out.println("Binary Search Result:");
        System.out.println(binaryResult);
    }
}