import java.util.*; //An example for ArrayList using Integer

public class basic 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>(); // *Resizable array * Fast access (get()) * Slower insert/delete in middle
        for (int i = 0; i < 4; i++) 
        {
            System.out.print("Enter the roll no: ");
            nums.add(s.nextInt());
        }
        System.out.println(nums);
        System.out.println(nums.get(2));
    }
}