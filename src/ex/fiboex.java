package ex;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;
import java.util.Scanner;

public class fiboex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = 9;
        int []arr =new int [N];

        int max=arr[0];
        int count=0;
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();

            if(max<arr[i]){
                max=arr[i];
                count =i;
            }
        }
        System.out.println(max);
        System.out.println(count+1);


    }
}
