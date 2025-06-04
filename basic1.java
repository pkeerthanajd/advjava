// import java.util.*;
// public class basic1 
// {
//     public static void main(String[] args) 
//     {
//         Map<String, Integer> stu = new TreeMap<>();
//         stu.put("Harsh", 45);
//         stu.put("Riyaa", 65);
//         stu.put("Aniee", 75);
//         stu.put("Ashmi", 20);
//         stu.put("Pavaa", 11);
//         stu.put("Kikki", 8);
//         // System.out.println(stu.values());
//         for(String value : stu.keySet())
//         {
//             System.out.println(value+" : "+stu.get(value));
//         }
//     }
// }

//---------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
public class basic1 
{
    public static void main(String[] args) 
    {
        Map<String, Integer> stu = new TreeMap<>();
        stu.put("Harsh", 45);
        stu.put("Riyaa", 65);
        stu.put("Aniee", 75);
        stu.put("Ashmi", 20);
        stu.put("Pavaa", 11);
        stu.put("Kikki", 8);
        System.out.println(stu.values());
        for(String value : stu.keySet())
        {
            System.out.println(value+" : "+stu.get(value));
        }
    }
}

