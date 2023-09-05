public class calpowerRecursion {
    public static int calPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==1){
            return 0;
        }

        int xPowerNMinus1 = calPower(x, n-1);
        int xPowerN = x * xPowerNMinus1;
        return xPowerN;
    }
    public static void main(String[] args) {
        int x = 2; int n = 5;
        int ans = calPower(x, n);
        System.out.println(ans);
    }
}
