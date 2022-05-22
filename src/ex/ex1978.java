package ex;

import java.util.Scanner;

public class ex1978 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();

        int count=0;


        for(int i=2; i<=num; i++){
            if(i==num){
                System.out.println("소수");
                break;

            }

            if(num% i ==0){
                System.out.println("소수아님");
                return;
            }

        }
    }
}
