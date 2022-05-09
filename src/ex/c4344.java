package ex;

import java.util.Scanner;

public class c4344 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr ;
        int testCase =  sc.nextInt();



        for(int i =0; i<testCase; i++){ // taseCase 번 실행
            int N = sc.nextInt();// 과목수
            double sum=0;
            arr= new int[N];
            for (int j=0; j <N;j++){

                int val= sc.nextInt(); // 과목 점수들 입력

                arr[j]= val;
                sum +=val;
            }
            double avg = (sum/N); //과목 평균
            double count =0; //평균몇명 넘는지

            for(int k= 0; k<N; k++){
                if (arr[k]>avg){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
        sc.close();






    }
}
