package Assignment4;

public class SqlQueryTextBlock
{
    public static void main(String[] args)
    {

        String sql = """
                          SELECT * FROM Customers
                          WHERE orderid= 21;
                          
                """;
        System.out.println(sql);

    }
}
