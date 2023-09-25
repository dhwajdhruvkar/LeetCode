import java.util.Scanner;

public class multiplyfunction {
    public static int calculateMultiplication (int a, int b){
        int mul = a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mul = calculateMultiplication(a, b);
        System.out.println(mul);

    }
}
