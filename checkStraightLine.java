import java.util.Scanner;

public class checkStraightLine{

    public boolean check(int[][] coordinates){
        int n = coordinates.length;

        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];

        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        for (int i = 2; i < n; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if ((y-y1)*(x-x2)!=(y-y2)*(x-x1)) {
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // number of coordinates
        int[][] coordinates = new int[n][2];
        for (int i = 0; i < n; i++) {
            coordinates[i][0] = sc.nextInt();
            coordinates[i][1] = sc.nextInt();
        }
        sc.close();
        checkStraightLine obj = new checkStraightLine();
        System.out.println(obj.check(coordinates));
    }
}