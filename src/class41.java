import java.util.Scanner;

public class class41 {

    //정수 x 에 사용할 수 있는연산은 다음과 같이 세가지다.
    //1.x 가 3으로 나누어 떻어지면 , 3으로 나눈따.
    //2. x 가 2로 나누어 떨어지면 2,로 나눈다.
    //3.1을뺀다.
    //정수 n 이 주어졌을때 위와같은 연산을 적절히 사용해서 1을 만들려고 할 때 연산을 사용하는 횟수의
    //최솟값은
    static int[] ans = new int[1000001];

    public static void main(String[] args) {
        ans[2] = 1;
        ans[3] = 1;
        // ans[4]  = 2
        // ans[5] = 3
        // ans[6] = 2

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for (int i = 4; i <= 1000000; i++) {
            int a = 99999, b = 99999, c = 99999;
            for (int w = 1; w <= 3; w++) {
                if (w == 1) {
                    a = ans[i - 1];
                } else if (w == 2) {
                    if (i % 2 == 0) {
                        b = ans[i / 2];
                    }
                } else if (w == 3) {
                    if (i % 3 == 0) {
                        c = ans[i / 3];
                    }
                }
            }
            int min = min(a, b, c);
            ans[i] = 1 + min;
        }
        System.out.println(ans[input]);
    }

    public static int min(int a, int b, int c) {
        if (a < b) {
            if (a < c)
                return a;
            else
                return c;
        } else {
            if (b < c)
                return b;
            else
                return c;
        }
    }
}