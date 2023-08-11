import java.util.Scanner;

public class largestAltitude {
    //There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
    //You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gain = new int[n];
        for(int i = 0; i < n; i++){
            gain[i] = sc.nextInt();
        }
        System.out.println(largestAltitude(gain));
        return;
    }
}
