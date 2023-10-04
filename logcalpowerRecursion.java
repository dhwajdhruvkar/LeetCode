public class logcalpowerRecursion {
    public static int calcPower(int x, int n) {
        if (n == 0) { //base case 1
            return 1;
        }
        if (x == 0) { //base case 2
            return 0;
        }
        //if n is even
        if (n % 2 == 0) {
            return calcPower(x, n/2) * calcPower(x, n/2);
        }
        //if n is odd
        else {
            return x * calcPower(x, n/2) * calcPower(x, n/2);
        }
    }
    public static void main(String[] args) {
        int x = 2; int n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
    }
