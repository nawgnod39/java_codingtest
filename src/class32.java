import java.util.Scanner;

public class class32 {

// 재귀
    public static int resum(int a, int b){



        if (a ==b){
            return b;
        }
        return a + resum(a+1,b);

    }

    public static void main(String[] args) {
        int start;
        int end;

        Scanner scan = new Scanner(System.in);
        end = scan.nextInt();
        start = scan.nextInt();



        int ans = 0;
        ans =resum(start,end);

        System.out.println("ACC SUM = "+ans);

    }
}
