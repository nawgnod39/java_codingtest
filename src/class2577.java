import java.util.Scanner;

public class class2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        int C;

        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();


        int sum= A*B*C;
        int []arr = new int[10];

        while (sum>0){
            arr[sum %10]++;
            sum=sum/10;
        }
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
