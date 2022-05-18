package ex;

import java.util.Scanner;

public class ex11809 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String s =sc.next();

        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }//전체 -1 로 초기화

        for(int i=0; i<s.length();i++){

            if(arr[s.charAt(i)-97]==-1){
                arr[s.charAt(i)-97] =i;
            }
        }
        for(int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
