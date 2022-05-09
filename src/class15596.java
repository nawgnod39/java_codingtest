import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;
import java.util.Scanner;

public class class15596 {
    public static long Test(int[] a){
        long sum=0;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i< a.length;i++){
            a[i]=sc.nextInt();

            sum +=a[i];
        }
        System.out.println(sum);
        return sum;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int []arr = new int[N];
        Test(arr);
    }
}
