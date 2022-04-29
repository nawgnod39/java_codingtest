import java.util.Scanner;

public class class25 {
//숫ㅈ ㅆ이클 1110
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int res = input;
        int sum = 0;
        int prev = 0;
        int cnt=0;
        String temp = "";
        while(true) {
            prev = input%10;
            sum = input/10 + input%10;
            if(sum >=10) sum = sum%10;
            input = prev*10 + sum;
            System.out.println(input);
            cnt++;

            if(input == res) break;
        }

        System.out.println(cnt);
    }
}
