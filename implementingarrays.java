import java.util.*;
public class implementingarrays{
    public static void reverse(int a[]){
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        reverse(arr);
    }
}