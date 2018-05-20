package AP01;

public class ArrayUtil {

    public static void main(String[] args)
    {
        int [] arr = {2,7,5,1,0};
        reverseArray(arr);
    }
    public static void reverseArray(int[] arr)
    {
        int mid = arr.length/2;
        for(int i = 0; i < mid; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
