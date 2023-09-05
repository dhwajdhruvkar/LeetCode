import java.util.Scanner;

public class circum {
    public static double circumference(int r){
        double circum = ((2*3.14)*r);
        return circum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.println("The circumference of the circle is : "+circumference(r));

    }
}
