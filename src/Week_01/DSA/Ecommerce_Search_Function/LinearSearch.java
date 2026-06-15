package Week_01.DSA.Ecommerce_Search_Function;

public class LinearSearch
{
    public static Product search(Product[] products, int targetId)
    {
        for(Product product : products)
        {
            if(product.productId == targetId)
            {
                return product;
            }
        }
        return null;
    }
}