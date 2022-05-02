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
        ///br bw 사용
      /*  BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int[] arr = new int[10];
        int sum = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        while (sum != 0) {
            arr[sum % 10]++;
            sum /= 10;
        }

        for (int i = 0; i < 10; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();*/

    }
}
