import java.util.ArrayList;
public class basic1 
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // allows duplicates
        System.out.println(list); 
    }
    
}
