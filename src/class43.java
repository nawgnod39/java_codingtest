import java.util.Scanner;

public class class43 {
    public static void main(String[] args) {

        int[] coin = new int[101];
        int[] dp = new int[10001];


         Scanner scan = new Scanner(System.in);
         int numCoin = scan.nextInt();//3
         int money = scan.nextInt();//10

         for (int i=1; i<=numCoin; i++){
              coin[i] = scan.nextInt(); // 1 , 2 , 5

         }
         dp[0]= 1;
         for(int i= 1; i<=numCoin;i++){
             for(int j =coin[i]; j<=money;j++){
                 dp[j] = dp[j]+dp[j-coin[i]];
             }
             System.out.println(dp[money]);
         }
         System.out.println(dp[money]);
    }
}
