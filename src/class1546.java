import java.util.Scanner;

public class class1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] arr = new double[sc.nextInt()];
        double max=0;
        double sol=0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
            if(arr[i]>max){
                max=  arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            sol+=(arr[i]/max)*100;
        }
        System.out.println(sol/arr.length);

    }
}
