import java.io.*;
import java.util.Scanner;

public class class4344 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr;

        int testcase = sc.nextInt();

        for(int i = 0 ; i < testcase ; i++) {

            int N = sc.nextInt(); //학생의수
            arr = new int[N];

            double sum = 0; //성적 누적 합

            // 성적 입력부분
            for(int j = 0 ; j < N ; j++) {
                int val = sc.nextInt();//성적 입력 부분
                arr[j] = val;
                sum += val;	// 성적 누적 합
            }

            double mean = (sum / N) ;
            double count = 0; // 평균 넘는 학생 수 변수

            // 평균 넘는 학생 비율
            for(int j = 0 ; j < N ; j++) {
                if(arr[j] > mean) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
        sc.close();
    }

}