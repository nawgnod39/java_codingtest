package ex;

import java.util.Scanner;

public class ex11720 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a=sc.nextLine();
        String[] st=a.split("");

        int b=0;
        int sol=0;
        for (int i=0; i<5;i++){
            sol+=Integer.parseInt(st[i]);

        }
        System.out.println(sol);
    }
}
