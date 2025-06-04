import java.util.*;

public class basic
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        Set<Integer> nums = new TreeSet<>();
        System.out.print("Size of array: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums.add(s.nextInt());
        }

        System.out.println("Sorted unique numbers: " + nums);
    }
}
