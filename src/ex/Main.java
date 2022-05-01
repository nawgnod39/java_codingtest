package ex;


import java.io.IOException;

import java.util.Scanner;


public class Main {
    //백준 2562
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);

        int N=9;
        int []arr= new int[N];

        int cnt=0;
        int max=arr[0];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1; i<arr.length ;i++){
            if(max<arr[i]){
              max =arr[i];
              cnt=i;
            }
        }

        System.out.println(max);
        System.out.println(cnt+1);

    }
}