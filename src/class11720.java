import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class class11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String str =sc.nextLine();
        String [] arr =str.split("");
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += Integer.parseInt(arr[i]);
        }

        System.out.println(sum);
    }
}
