import java.util.Scanner;

public class class1065 {

    public static int answer(int a) {
        int count = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        if (a < 100) {
            return a;
        } else {
            count = 99;//3자리수 99 default
            for(int i=100; i<=a;i++){
                num1 = i%10;//1의자리
                num2 = (i/10)%10;//2번째자리수
                num3 = i/100; //3번째 자리수
                if(num2-num1 == num3-num2){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(answer(sc.nextInt()));
    }
}
