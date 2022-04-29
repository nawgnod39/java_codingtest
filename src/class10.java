import java.util.Scanner;

public class class10 {
    public static void main(String[] args) {

//숫자사각형 1 번
        int n = 5;

       // int num = 1;
        for (int i =0 ;i<n;i++){
            for (int j=0; j<n; j++){
                System.out.printf("%5d",i*(n)+j+1);
              //  num++;
            }
            System.out.println();

        }


/* 숫자입력
        Scanner scan = new Scanner(System.in);
        int str;

        System.out.println("Scanner 방식의 입력 테스트 입니다.");

        str = scan.nextInt();

        for (int i=0; i<=str; i++){

        }
        System.out.println(str);
*/
    }
}
