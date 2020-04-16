import java.util.Random;

interface Function
{
    int evaluate(int val);
}


class Half implements Function
{
    public int evaluate(int val)
    {
        return val/2;
    }
}
public class Client extends Half
{
    public static void main(String [] args)
    {
        int [] arr = new int[10];
        Random rand = new Random();
        for(int i=0;i<10;i++)
        {
            arr[i] = rand.nextInt(40);
        }
        for(int x : arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        Half hf = new Client();
        for(int i=0;i<10;i++)
        {
            arr[i] = hf.evaluate(arr[i]);
        }
        for(int x : arr)
        {
            System.out.print(x+" ");
        }
    }
}